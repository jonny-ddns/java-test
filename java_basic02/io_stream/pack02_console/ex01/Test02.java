package java_basic02.io_stream.pack02_console.ex01;

import java.io.IOException;
import java.io.InputStream;
//�ѱ��� ���� ����

public class Test02 {
    public static void main(String[] args) throws IOException {
        System.out.println("start");
        InputStream istream = System.in;

        byte[] byteArr = new byte[4];
        int a;
        while((a = istream.read(byteArr)) != -1){

            for(byte b : byteArr){
                System.out.println(b);
            }
            if(a == 13 || a == 10) { break; }    //ĳ���� ���� �ɷ�����
        }
        System.out.println("end");
    }
}
