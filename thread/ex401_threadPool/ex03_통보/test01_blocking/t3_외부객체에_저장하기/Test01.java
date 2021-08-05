package thread.ex401_threadPool.ex03_통보.test01_blocking.t3_외부객체에_저장하기;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01 {
    class Result{
        int accumValue;
        synchronized void addValue(int value){
            accumValue += value;
        }
    }

    class Task implements Runnable{
        Result result;

        Task(Result result){
            this.result = result;
        }
        @Override
        public void run() {
            int sum = 0;
            for(int i=1; i<=10; i++){
                sum+=i;
            }
            result.addValue(sum);
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Test01 t = new Test01();

        Result result = t.new Result();
        Runnable task1 = t.new Task(result);
        Runnable task2 = t.new Task(result);
        Runnable task3 = t.new Task(result);
        Runnable task4 = t.new Task(result);
        Runnable task5 = t.new Task(result);

        Future<Result> future1 = service.submit(task1, result);
        Future<Result> future2 = service.submit(task2, result);
        Future<Result> future3 = service.submit(task3, result);
        Future<Result> future4 = service.submit(task4, result);
        Future<Result> future5 = service.submit(task5, result);

        try{
            result = future1.get();
            result = future2.get();
            result = future3.get();
            result = future4.get();
            result = future5.get();
        } catch (InterruptedException ie){
            ie.getMessage();
        } catch (ExecutionException ee){
            ee.getMessage();
        } catch (Exception e){
            e.getMessage();
        }

        System.out.println("처리결과 : "+ result.accumValue);
        service.shutdown();
    }
}
