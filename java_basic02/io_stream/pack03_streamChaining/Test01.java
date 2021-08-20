package java_basic02.io_stream.pack03_streamChaining;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        BufferedInputStream bufferedIS = null;
        try {
            String fileName = "D:/Programming/_temp/test11.txt";
            inputStream = new FileInputStream(fileName);
            bufferedIS = new BufferedInputStream(inputStream);
            int a ;
            while(( a = bufferedIS.read()) != -1 ){
                System.out.println((char) a);
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (bufferedIS != null) bufferedIS.close();
                if (inputStream != null) inputStream.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
