package java_basic02.io_stream.pack01_inputStream_outputStream.ex03_reader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.IOException;

//FileReader
public class Test01 {
    public static void main(String[] args) throws IOException{
        System.out.println("start");
        int readData;
        String fileIn = "D:/Programming/_temp/testRead.txt";
        String fileOut = "D:/Programming/_temp/testWrite.txt";

        Reader fr = new FileReader(fileIn);
        Writer fw = new FileWriter(fileOut);

        while ((readData = fr.read()) != -1){
            char charData = (char) readData;
            System.out.println(charData);
            fw.write(readData);
        }
        fr.close();
        fw.flush();
        fw.close();
        System.out.println("end");
    }
}