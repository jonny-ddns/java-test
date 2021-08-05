package networking.pack01_inetaddress.ex02;

import java.net.InetSocketAddress;

public class Test02 {
    public static void main(String[] args) {
        InetSocketAddress addr = new InetSocketAddress("localhost", 7000);
        System.out.println(addr.getAddress());
        System.out.println(addr.getHostName());
        System.out.println(addr.getPort());
    }
}
