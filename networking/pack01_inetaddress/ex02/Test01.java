package networking.pack01_inetaddress.ex02;

import java.net.InetSocketAddress;

public class Test01 {
    public static void main(String[] args) {
        InetSocketAddress addr = new InetSocketAddress(7000);
        System.out.println(addr.getAddress());
        System.out.println(addr.getHostName());
        System.out.println(addr.getPort());
    }
}
