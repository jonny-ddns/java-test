package java_basic02.io_stream.pack04_printWriter.ex01;

import java.io.IOException;
import java.io.PrintWriter;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //workspace �� �ش� ������ ������
        PrintWriter printWriter = new PrintWriter("hello.txt");
        printWriter.println("hello world");
        printWriter.close();
    }
}
