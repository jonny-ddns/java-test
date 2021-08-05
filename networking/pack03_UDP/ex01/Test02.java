package networking.pack03_UDP.ex01;

import java.net.DatagramPacket;
import java.net.InetSocketAddress;

public class Test02 {
    public static void main(String[] args) {
        byte[] byteArr = new byte[]{};
        new DatagramPacket(
                byteArr,
                byteArr.length
        );

        new DatagramPacket(
                new byte[]{},
                byteArr.length,
                new InetSocketAddress("localhost", 7000)
        );

    }

}
