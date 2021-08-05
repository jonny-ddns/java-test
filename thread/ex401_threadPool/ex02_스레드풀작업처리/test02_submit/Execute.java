package thread.ex401_threadPool.ex02_������Ǯ�۾�ó��.test02_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        for(int i=0; i<8; i++){
            threadPool.submit(new Todo());
        }

        threadPool.shutdown();
    }
}
