package java_basic02.networking.pack01_inetaddress.ex02;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class Test03 {
    public static void main(String[] args) throws UnknownHostException {
        InetSocketAddress addr = new InetSocketAddress(InetAddress.getByName("www.google.com"), 7000);
        System.out.println(addr.getAddress());
        System.out.println(addr.getHostName());
        System.out.println(addr.getPort());
    }
}
