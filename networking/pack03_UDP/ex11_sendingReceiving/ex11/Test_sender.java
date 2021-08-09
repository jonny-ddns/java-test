package networking.pack03_UDP.ex11_sendingReceiving.ex11;

import java.io.IOException;
import java.net.*;

public class Test_sender {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            System.out.println("sender 전송 시도");

            //DatagramSocket 객체 생성, ip-port 설정
            InetAddress ia = InetAddress.getByName("localhost");
            datagramSocket = new DatagramSocket(7000);

            //DatagramPacket 객체 생성하기
            byte[] byteArr = new byte[]{97, 98, 99};

            //DatagramPacket 객체 생성
            //전송할 ip, 주소 설정
            DatagramPacket packet = new DatagramPacket(byteArr, 0, byteArr.length, ia, 5000);

            //데이터 전송
            datagramSocket.send(packet);
            System.out.println("sender 전송 완료");
        } catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            if(datagramSocket != null) { datagramSocket.close(); }
        }
    }
}