package java_basic02.thread.ex401_threadPool.ex03_통보.test01_blocking.t2_리턴값이_있는_통보;

import java.util.concurrent.*;

public class Test01 {

    Callable task = new Callable() {
        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for(int i=1; i<=10; i++){
                sum += i;
            }
            return sum;
        }
    };

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(16);
        Future<Integer> future = ex.submit(new Test01().task);

        try{
            int sum = future.get();
            System.out.println("sum : "+ sum);
        } catch (InterruptedException ie){
            ie.getMessage();
        } catch (ExecutionException ee){
            ee.getMessage();
        } catch (Exception e){
            e.getMessage();
        }

        ex.shutdown();
    }
}
