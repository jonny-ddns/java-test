package networking.pack01_inetaddress.ex01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test03 {
    public static void main(String[] args) {
        try {
            String domain = "www.naver.com";
            InetAddress[] iaArr = InetAddress.getAllByName(domain);

            for(InetAddress i : iaArr){
                System.out.println(i.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
