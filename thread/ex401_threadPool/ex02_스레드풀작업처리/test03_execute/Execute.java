package thread.ex401_threadPool.ex02_스레드풀작업처리.test03_execute;

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
