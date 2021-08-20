package java_basic02.networking.pack02_TCP.pack02_serverSocket.ex01;

import java.io.IOException;
import java.net.ServerSocket;

public class Test02 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
//            serverSocket.bind(new InetSocketAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
