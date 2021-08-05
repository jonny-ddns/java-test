package networking.pack03_UDP.ex03;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Test_sender {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            System.out.println("sender");
//            datagramSocket = new DatagramSocket(new InetSocketAddress("localhost", 7000));
            datagramSocket = new DatagramSocket();
            byte[] byteArr = new byte[]{97, 98, 99};
            DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length, new InetSocketAddress("localhost", 7000));
            datagramSocket.send(packet);
            System.out.println("send...?");
        } catch (SocketException se){
            se.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(datagramSocket != null) { datagramSocket.close(); }
        }
    }
}
