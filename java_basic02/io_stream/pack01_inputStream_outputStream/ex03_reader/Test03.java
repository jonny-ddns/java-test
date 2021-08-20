package java_basic02.io_stream.pack01_inputStream_outputStream.ex03_reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//FileReader
public class Test03 {
    public static void main(String[] args) throws IOException {
//        System.out.println("start");
        String fileOut = "D:/Programming/_temp/testWrite.txt";

        Writer fw = new FileWriter(fileOut);

        char[] charArr = "123abcȫ�浿".toCharArray();
        fw.write(charArr);

        fw.flush();
        fw.close();
//        System.out.println("end");
    }
}
