package io.codeforall.bootcamp.server.commands;

import io.codeforall.bootcamp.server.ClientConnection;
import io.codeforall.bootcamp.server.Messages;
import io.codeforall.bootcamp.server.Server;

public class QuitHandler implements CommandHandler{

    @Override
    public void handle(Server server, ClientConnection sender, String message) {
        server.remove(sender);
        server.broadcast(sender.getName() + " " + Messages.LEAVE);
        sender.close();
    }
}
