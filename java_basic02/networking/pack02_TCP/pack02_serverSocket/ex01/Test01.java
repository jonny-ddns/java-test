package java_basic02.networking.pack02_TCP.pack02_serverSocket.ex01;

import java.io.IOException;
import java.net.InetAddress;

public class Test01 {
    public static void main(String[] args) {
        try {


            InetAddress inetAddress = InetAddress.getLocalHost();
//            ServerSocket serverSocket1 = new ServerSocket(7000);
//
//            ServerSocket serverSocket2 = new ServerSocket(7001, 10);
//            ServerSocket serverSocket3 = new ServerSocket(7002, 10, inetAddress);
//
//            System.out.println(serverSocket3.getLocalPort());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
