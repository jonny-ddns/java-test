package io_stream.pack01_inputStream_outputStream.ex01_inputStream;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    //IOException 이 발생한다. 예외 throws 처리
    public static void main(String[] args) throws IOException{
        System.out.println("start");

        InputStream is = new DataInputStream(System.in);
        int a = is.read();
        System.out.println("바이트 읽기: "+ a);
        byte b = (byte) a;
        System.out.println("바이트 char변환 : "+ (char)b);

        //스트림 사용한 뒤에는 닫아주기
        is.close();
        System.out.println("end");
    }
}
