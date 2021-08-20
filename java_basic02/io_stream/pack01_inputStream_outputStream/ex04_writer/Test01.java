package java_basic02.io_stream.pack01_inputStream_outputStream.ex04_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test01 {
    public static void main(String[] args) throws IOException {
        String fileName = "D:/Programming/_temp/test01.txt";
        Writer fw = new FileWriter(fileName);
        String message = "hello ȫ�浿";
        fw.write(message);
        fw.close();
    }
}
