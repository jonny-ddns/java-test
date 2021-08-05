package thread.ex401_threadPool.ex02_스레드풀작업처리.test04_예외일으키기;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        for(int i=0; i<8; i++){
            threadPool.submit(new Todo("홍길동"));
        }

//       for(int i=0; i<16; i++){
//           threadPool.execute(new Todo("홍길동"));
//        }

        threadPool.shutdown();
    }
}
