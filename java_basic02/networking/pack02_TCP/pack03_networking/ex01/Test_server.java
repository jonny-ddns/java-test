package java_basic02.networking.pack02_TCP.pack03_networking.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;


public class Test_server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            //ServerSocket ��ü ����
            serverSocket = new ServerSocket();
            //ServerSocket ��ü�� Ư���ּ� ���ε�
            serverSocket.bind(new InetSocketAddress("localhost", 7000));

            while(true){
                System.out.println("server - ���� ���");
                //Ŭ���̾�Ʈ ��û ����. Socket ����
                Socket socket = serverSocket.accept();
                SocketAddress addr = socket.getRemoteSocketAddress();
                System.out.println(addr.toString());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                System.out.println("server - close");
                if(!serverSocket.isClosed()){
                    serverSocket.close();
                }
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
}