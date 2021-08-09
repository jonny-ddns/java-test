package networking.pack03_UDP.ex11_sendingReceiving.ex11;

import java.io.IOException;
import java.net.*;

public class Test_sender {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            System.out.println("sender ���� �õ�");

            //DatagramSocket ��ü ����, ip-port ����
            InetAddress ia = InetAddress.getByName("localhost");
            datagramSocket = new DatagramSocket(7000);

            //DatagramPacket ��ü �����ϱ�
            byte[] byteArr = new byte[]{97, 98, 99};

            //DatagramPacket ��ü ����
            //������ ip, �ּ� ����
            DatagramPacket packet = new DatagramPacket(byteArr, 0, byteArr.length, ia, 5000);

            //������ ����
            datagramSocket.send(packet);
            System.out.println("sender ���� �Ϸ�");
        } catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            if(datagramSocket != null) { datagramSocket.close(); }
        }
    }
}