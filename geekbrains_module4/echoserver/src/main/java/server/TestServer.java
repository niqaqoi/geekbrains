package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

    private ServerSocket socket;

    public TestServer() throws IOException {
        socket = new ServerSocket(8080);
        start();
    }

    private void start() throws IOException {
        System.out.println("Server socket started...");
        System.out.println("Server socket is waiting for a connection...");
        Socket accepted = socket.accept();
        System.out.println("Client connected");
        System.out.println("Adress" + accepted.getInetAddress());
    }
}
