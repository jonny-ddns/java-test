package networking.pack03_UDP.ex11_sendingReceiving.ex12;

import java.io.UnsupportedEncodingException;
import java.net.*;

public class Test_receiver {
    public static void main(String[] args) {
        System.out.println("receiver");
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket(new InetSocketAddress("localhost", 7010));
            while(true){
//                System.out.println("while - start");
                byte[] byteArr = new byte[]{};
                DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length);
                String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
                if(data.length() != 0){
                    System.out.println(data);
                }

//                if(data != null){
//                    System.out.println("data : "+ data);
//                } else{
//                    System.out.println("data == null");
//                }
////                System.out.println("while - end");
            }
        } catch (SocketException | UnsupportedEncodingException e){
            e.printStackTrace();
        } finally {
            if(datagramSocket != null) { datagramSocket.close(); }
        }
    }
}
