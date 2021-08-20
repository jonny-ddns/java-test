package java_basic02.thread.ex401_threadPool.ex01_create.test01;

import java.util.concurrent.*;

public class Execute {

    public static void main(String[] args) {
        ExecutorService exe1 = Executors.newCachedThreadPool();
        ExecutorService exe2 = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );


        ExecutorService executorService = new ThreadPoolExecutor(3, 100, 3, TimeUnit.MINUTES, new SynchronousQueue<>());
        System.out.println("프로세서 개수 : "+ Runtime.getRuntime().availableProcessors());
    }
}
