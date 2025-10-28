package io.codeforall.bootcamp.server.commands;

import io.codeforall.bootcamp.server.ClientConnection;
import io.codeforall.bootcamp.server.Server;

public class MessageHandler implements CommandHandler{

    @Override
    public void handle(Server server, ClientConnection sender, String message) {

        if (!isValid(message)) {
            return;
        }

        server.broadcast(sender.getName() + ": " + message);
    }

    private boolean isValid(String message) {
        return !message.trim().isEmpty();
    }
}
