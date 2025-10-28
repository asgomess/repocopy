package io.codeforall.bootcamp.server.commands;

import io.codeforall.bootcamp.server.ClientConnection;
import io.codeforall.bootcamp.server.Messages;
import io.codeforall.bootcamp.server.Server;

public class InvalidHandler implements CommandHandler{

    @Override
    public void handle(Server server, ClientConnection sender, String message) {
        sender.send(Messages.ERROR + ": " + (message.startsWith(Messages.COMMAND_IDENTIFIER) ? Messages.INVALID_COMMAND : message));
    }
}
