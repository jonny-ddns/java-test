package io_stream.pack02_console.ex01;

import java.io.IOException;
import java.io.InputStream;
//�ѱ��� ���� ����

public class Test01 {
    public static void main(String[] args) throws IOException {
        System.out.println("start");
        InputStream istream = System.in;

        int a;
        while((a = istream.read()) != -1){
            if(a == 13 || a == 10) { break; }   //ĳ���� ���� �ɷ�����
            System.out.println((char) a);
        }
        System.out.println("end");
    }
}
