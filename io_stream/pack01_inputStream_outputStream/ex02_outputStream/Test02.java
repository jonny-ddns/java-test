package io_stream.pack01_inputStream_outputStream.ex02_outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test02 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:/Programming/_temp/testOut.txt");
        byte[] sendDate = "ABC234ȫ�浿".getBytes();
        os.write(sendDate);
        os.flush();
        os.close();
    }
}
