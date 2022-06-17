package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        new Server().start();
    }

    public void start() throws IOException {

        ServerSocket serverSocket = new ServerSocket(9000);
        System.out.println("Server started");
        while(true) {
            Socket socket = serverSocket.accept();
            System.out.println("Accept new incoming connection"); }
    }

    public void read() throws IOException {

    }
}
