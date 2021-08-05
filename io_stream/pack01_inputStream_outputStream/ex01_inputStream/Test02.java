package io_stream.pack01_inputStream_outputStream.ex01_inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test02 {
    public static void main(String[] args) throws IOException {
        System.out.println("start");
        InputStream is = new FileInputStream("D:/Programming/_temp/testIn.txt");
        int readByte = 0;
        while((readByte = is.read()) != -1){
            byte b = (byte) readByte;
            System.out.println(readByte+ " charº¯È¯ : "+ (char)b);
        }

        is.close();
        System.out.println("end");
    }
}
