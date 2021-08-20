package java_basic02.networking.pack02_TCP.pack02_serverSocket.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class Test03 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 7000));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
