package io.codeforall.bootcamp.server.commands;

import io.codeforall.bootcamp.server.ClientConnection;
import io.codeforall.bootcamp.server.Server;

public class ListHandler implements CommandHandler {
    @Override
    public void handle(Server server, ClientConnection sender, String message) {
        sender.send(server.listClients());
    }
}
