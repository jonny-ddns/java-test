package java_basic02.io_stream.pack01_inputStream_outputStream.ex02_outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test04 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:/Programming/_temp/testOut.txt");
        byte[] sendDate = "ABC12345".getBytes();
        os.write(sendDate, 3, 3);
        os.flush();
        os.close();
    }
}
