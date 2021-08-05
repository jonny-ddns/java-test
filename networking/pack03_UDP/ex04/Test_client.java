package networking.pack03_UDP.ex04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Test_client {

    private String str;
    private BufferedReader file;
    private static int SERVERPORT = 7000;

    public Test_client(String ip, int port){
        try{
            InetAddress ia = InetAddress.getByName(ip);
            DatagramSocket ds = new DatagramSocket(port);
            System.out.println("message : ");
            file = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            str = file.readLine();

            byte buffer[] = str.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, ia, SERVERPORT);

            ds.send(packet);
            buffer = new byte[512];

            packet = new DatagramPacket(buffer, buffer.length);
            ds.receive(packet);
            System.out.println("¼ö½Å");

            System.out.println(new String(packet.getData()).trim());

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Test_client("localhost", 2000);
    }
}
