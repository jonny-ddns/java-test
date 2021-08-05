package io_stream.pack03_streamChaining;

import java.io.*;

public class Test03 {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        BufferedOutputStream bufferedOS = null;
        try {
            String fileName = "D:/Programming/_temp/test11.txt";
            outputStream = new FileOutputStream(fileName);
            bufferedOS = new BufferedOutputStream(outputStream);
            String message = "hello world";
            bufferedOS.write(message.getBytes());
            bufferedOS.flush();
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (bufferedOS != null) bufferedOS.close();
                if (outputStream != null) outputStream.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
