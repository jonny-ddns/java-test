package io_stream.pack01_inputStream_outputStream.ex03_reader;

import java.io.*;

//FileReader
public class Test02 {
    public static void main(String[] args) throws IOException {
        System.out.println("start");
        String fileIn = "D:/Programming/_temp/testRead.txt";
        String fileOut = "D:/Programming/_temp/testWrite.txt";

        Reader fr = new FileReader(fileIn);
        Writer fw = new FileWriter(fileOut);

        char[] cbuf = new char[4];

        fr.read(cbuf, 3,3);

        while(fr.read(cbuf) != -1){
            for(char c : cbuf){
                System.out.println("c : "+ c);
            }
            fw.write(cbuf);
        }
        fr.close();
        fw.flush();
        fw.close();
        System.out.println("end");
    }
}
