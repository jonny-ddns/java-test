package networking.pack03_UDP.ex02;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Test_receiver {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket();
        } catch (SocketException se){
            se.printStackTrace();
        } finally {
            if(datagramSocket != null){ datagramSocket.close(); }
        }
    }
}
