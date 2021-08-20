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
            //ServerSocket 객체 생성
            serverSocket = new ServerSocket();
            //ServerSocket 객체에 특정주소 바인딩
            serverSocket.bind(new InetSocketAddress("localhost", 7000));

            while(true){
                System.out.println("server - 연결 대기");
                //클라이언트 요청 수락. Socket 생성
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