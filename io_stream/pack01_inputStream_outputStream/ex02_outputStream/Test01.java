package io_stream.pack01_inputStream_outputStream.ex02_outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test01 {
    public static void main(String[] args) throws IOException {
        System.out.println("start");
        OutputStream os = new FileOutputStream("D:/Programming/_temp/testOut.txt");
        byte[] sendDate = "ABC123°¡³ª".getBytes();
        for(byte b: sendDate){
            os.write(b);
        }
        os.flush();
        os.close();
        System.out.println("end");
    }
}
