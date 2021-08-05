package networking.pack02_TCP.pack03_networking.ex01;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class Test_client {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", 7000));

            System.out.println("client 연결 성공");
            SocketAddress addr = socket.getRemoteSocketAddress();
            System.out.println("연결정보 : "+ addr.toString());
        } catch (ConnectException ce){
            ce.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            try {
                Thread.sleep(1000);
                System.out.println("client - close");
                if(!socket.isClosed()){
                    socket.close();
                }
            } catch (InterruptedException ie){
                ie.printStackTrace();
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
}
