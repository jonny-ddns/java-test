package networking.pack02_TCP.ex01_socket;

import java.io.IOException;
import java.net.Socket;

public class Test01 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 7000);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
