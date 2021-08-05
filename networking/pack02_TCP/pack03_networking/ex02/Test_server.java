package networking.pack02_TCP.pack03_networking.ex02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Test_server {
    //60초 후에 자동으로 서버소켓이 닫힌다
    private void serverClose() throws InterruptedException{
        System.out.println("serverClose() 호출");
        Thread.sleep(10000);
        serverOpen = !serverOpen;
        System.out.println("serverClose() 종료");
    }

    boolean serverOpen = true;

    public static void main(String[] args) {
        Test_server t = new Test_server();
        ServerSocket serverSocket = null;

        try {
            //ServerSocket 객체 생성
            serverSocket = new ServerSocket();
            //ServerSocket 객체에 특정주소 바인딩
            serverSocket.bind(new InetSocketAddress("localhost", 7000));

            t.serverClose();
            while(t.serverOpen){
                System.out.println("연결 대기 중");
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