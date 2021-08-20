package java_basic02.networking.pack03_UDP.ex01;

import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Test01 {
    public static void main(String[] args) throws SocketException {
        DatagramSocket ds = new DatagramSocket();
        ds.connect(new InetSocketAddress(7000));
        System.out.println("isConnected : "+ ds.isConnected());
        System.out.println("port : "+ ds.getPort());
        System.out.println("localAddr : "+ ds.getLocalAddress());
        System.out.println("localPort : "+ ds.getLocalPort());
        if(!ds.isClosed()){ ds.close(); }
    }
}
