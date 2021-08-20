package java_basic02.io_stream.pack01_inputStream_outputStream.ex01_inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test04 {
    public static void main(String[] args) throws IOException {
        System.out.println("start");
        InputStream is = new FileInputStream("D:/Programming/_temp/testIn.txt");
        byte[] byteArr = new byte[4];
        int readByte;
        while((readByte = is.read(byteArr, 0, byteArr.length)) != -1){
            for(byte b : byteArr){
                System.out.println(b + " | "+ (char) b);
            }
        }
        is.close();
        System.out.println("end");
    }
}
