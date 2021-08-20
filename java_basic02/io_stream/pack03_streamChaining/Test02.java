package java_basic02.io_stream.pack03_streamChaining;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test02 {
    public static void main(String[] args) {
        try {
            String fileName = "D:/Programming/_temp/test11.txt";
            InputStream inputStream = new FileInputStream(fileName);
            BufferedInputStream bufferedIS = new BufferedInputStream(inputStream);
            int a ;
            byte[] byteArr = new byte[100];
            while(( a = bufferedIS.read(byteArr)) != -1 ){
//                System.out.println((char) a);
            }
            for(byte b : byteArr){
                System.out.println((char) b);
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
