package io_stream.pack02_console.ex01;

import java.io.IOException;
import java.io.InputStream;
//한글은 읽지 못함

public class Test01 {
    public static void main(String[] args) throws IOException {
        System.out.println("start");
        InputStream istream = System.in;

        int a;
        while((a = istream.read()) != -1){
            if(a == 13 || a == 10) { break; }   //캐리지 리턴 걸러내기
            System.out.println((char) a);
        }
        System.out.println("end");
    }
}
