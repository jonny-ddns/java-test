package thread.ex401_threadPool.ex02_������Ǯ�۾�ó��.test03_execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        for(int i=0; i<8; i++){
            threadPool.execute(new Todo());
        }

        threadPool.shutdown();
    }
}
