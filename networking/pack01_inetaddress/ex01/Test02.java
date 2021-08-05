package networking.pack01_inetaddress.ex01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test02 {
    public static void main(String[] args) {
        try {
            String domain = "www.google.com";
            InetAddress ia = InetAddress.getByName(domain);

            System.out.println("inetAddr : "+ ia.toString());
            System.out.println("host ip : "+ ia.getHostAddress());
            System.out.println("host name : "+ ia.getHostName());
            System.out.println("isReachable : "+ ia.isReachable(1000));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
