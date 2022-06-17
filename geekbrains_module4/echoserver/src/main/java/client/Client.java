package client;

import java.io.IOException;
import java.net.Socket;

public class Client {

    private Socket socket;

    public Client() throws IOException {
        this.socket = new Socket("localhost", 8080 );
    }
}
