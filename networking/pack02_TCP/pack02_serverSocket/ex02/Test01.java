package networking.pack02_TCP.pack02_serverSocket.ex02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class Test01 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            //ServerSocket ��ü ����
            serverSocket = new ServerSocket();
            //ServerSocket ��ü�� Ư���ּ� ���ε�
            serverSocket.bind(new InetSocketAddress("localhost", 7000));

            System.out.println("���� ���");
            //Ŭ���̾�Ʈ ��û ����. Socket ����
            serverSocket.accept();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try{
                System.out.println("serverSocket - close");
                if(!serverSocket.isClosed()){ serverSocket.close(); }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
