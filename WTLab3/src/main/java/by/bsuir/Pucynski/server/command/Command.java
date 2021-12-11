package by.bsuir.Pucynski.server.command;

import by.bsuir.Pucynski.server.command.exception.CommandException;

public interface Command {
    String complete(Object caller, String request) throws CommandException;
}
