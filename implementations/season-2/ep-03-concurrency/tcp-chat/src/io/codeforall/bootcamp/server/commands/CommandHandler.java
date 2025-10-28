package io.codeforall.bootcamp.server.commands;

import io.codeforall.bootcamp.server.ClientConnection;
import io.codeforall.bootcamp.server.Server;

public interface CommandHandler {
    void handle(Server server, ClientConnection sender, String message);
}
