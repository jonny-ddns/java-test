package java_basic02.networking.pack01_inetaddress.ex01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) {
        try {
            //local host의 InetAddress 객체 가져오기
            InetAddress inad = InetAddress.getLocalHost();

            System.out.println("getLocalHost : "+ inad.toString());
            System.out.println("hostAddress : "+inad.getHostAddress());
            System.out.println("hostName : "+ inad.getHostName());
            System.out.println("canonicalHostName : "+ inad.getCanonicalHostName());
            System.out.println("isSiteLocalAddress : "+ inad.isSiteLocalAddress());
            System.out.println("isLinkLocalAddress : "+ inad.isLinkLocalAddress());
            System.out.println("isReachable : "+ inad.isReachable(10));

            byte[] byteArr = inad.getAddress();
            for(byte b : byteArr){
                System.out.println("byte : "+ b);
            }

            InetAddress[] inetArr = InetAddress.getAllByName("localhost");
            for(InetAddress i : inetArr){
                System.out.println("inetArr : "+ i);
            }

            InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
            System.out.println("loopbackAddress : "+ loopbackAddress.toString());
        } catch (UnknownHostException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
