package java_basic02.thread.ex401_threadPool.ex03_통보.test01_blocking.t1_리턴값이_없는_통보;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01 {

    Runnable runTodo = new Runnable() {
        @Override
        public void run() {
            int sum = 0;
            for(int i=1; i<=10; i++){
                sum += i;
            }
            System.out.println("sum : "+ sum);
        }
    };

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(16);

        Future future = ex.submit(new Test01().runTodo);

        try{
            //정상처리되면 null 리턴
            //작업 중 interrupt -> InterruptedException
            //작업 중 예외발생 -> ExecutionException
            future.get();
            System.out.println(future.isDone());
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
