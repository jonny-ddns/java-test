package io_stream.pack01_inputStream_outputStream.ex01_inputStream;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    //IOException �� �߻��Ѵ�. ���� throws ó��
    public static void main(String[] args) throws IOException{
        System.out.println("start");

        InputStream is = new DataInputStream(System.in);
        int a = is.read();
        System.out.println("����Ʈ �б�: "+ a);
        byte b = (byte) a;
        System.out.println("����Ʈ char��ȯ : "+ (char)b);

        //��Ʈ�� ����� �ڿ��� �ݾ��ֱ�
        is.close();
        System.out.println("end");
    }
}
