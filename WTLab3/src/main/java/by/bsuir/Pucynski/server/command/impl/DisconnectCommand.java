package by.bsuir.Pucynski.server.command.impl;

import by.bsuir.Pucynski.server.command.Command;
import by.bsuir.Pucynski.server.command.exception.CommandException;
import by.bsuir.Pucynski.server.model.AuthType;
import by.bsuir.Pucynski.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
