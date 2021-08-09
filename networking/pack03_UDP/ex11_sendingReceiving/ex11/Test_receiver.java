package networking.pack03_UDP.ex11_sendingReceiving.ex11;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test_receiver {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try {
            System.out.println("데이터 수신 준비");
            ds = new DatagramSocket(5000);

            byte[] buffer = new byte[512];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            System.out.println("ready");

            ds.receive(packet);
            String str = new String(packet.getData());
            System.out.println("수신 : "+ str);

            int dataLength = 3;
            byte[] byteArr = new byte[dataLength];
//            DatagramPacket packet = new DatagramPacket(byteArr, dataLength);

            //데이터 수신할 때까지 블로킹 중
            System.out.println("길이 : "+ packet.getLength());
            byteArr = packet.getData();

            System.out.println("수신한 데이터 확인");
            for(byte b : byteArr){
                System.out.println((char) b);
            }
        } catch (SocketException se){
            se.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(ds != null){ ds.close(); }
        }
    }
}
