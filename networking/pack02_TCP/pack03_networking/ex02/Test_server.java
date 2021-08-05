package networking.pack02_TCP.pack03_networking.ex02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Test_server {
    //60�� �Ŀ� �ڵ����� ���������� ������
    private void serverClose() throws InterruptedException{
        System.out.println("serverClose() ȣ��");
        Thread.sleep(10000);
        serverOpen = !serverOpen;
        System.out.println("serverClose() ����");
    }

    boolean serverOpen = true;

    public static void main(String[] args) {
        Test_server t = new Test_server();
        ServerSocket serverSocket = null;

        try {
            //ServerSocket ��ü ����
            serverSocket = new ServerSocket();
            //ServerSocket ��ü�� Ư���ּ� ���ε�
            serverSocket.bind(new InetSocketAddress("localhost", 7000));

            t.serverClose();
            while(t.serverOpen){
                System.out.println("���� ��� ��");
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