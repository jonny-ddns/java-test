package java_basic02.networking.pack03_UDP.ex11_sendingReceiving.ex13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Test_server {

    public Test_server(int port){
        try {
            DatagramSocket ds = new DatagramSocket(port);
            while(true){
                byte[] buffer = new byte[512];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                System.out.println("ready");

                ds.receive(packet);
                String str = new String(packet.getData());
                System.out.println("수신 : "+ str);

                InetAddress ia = packet.getAddress();
                port = packet.getPort();
                System.out.println("클라이언트에서 수신함");

                new DatagramPacket(packet.getData(), packet.getData().length, ia, port);
                ds.send(packet);
            }
        } catch (SocketException se) {
            se.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Test_server(7000);
    }
}
