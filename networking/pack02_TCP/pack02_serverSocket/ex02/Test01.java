package networking.pack02_TCP.pack02_serverSocket.ex02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class Test01 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            //ServerSocket 객체 생성
            serverSocket = new ServerSocket();
            //ServerSocket 객체에 특정주소 바인딩
            serverSocket.bind(new InetSocketAddress("localhost", 7000));

            System.out.println("연결 대기");
            //클라이언트 요청 수락. Socket 생성
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
