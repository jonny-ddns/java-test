package networking.pack02_TCP.pack02_serverSocket.ex01;

import java.io.IOException;
import java.net.ServerSocket;

public class Test01 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
