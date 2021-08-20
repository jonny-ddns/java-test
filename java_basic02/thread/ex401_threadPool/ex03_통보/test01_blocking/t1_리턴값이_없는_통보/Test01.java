package java_basic02.thread.ex401_threadPool.ex03_�뺸.test01_blocking.t1_���ϰ���_����_�뺸;

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
            //����ó���Ǹ� null ����
            //�۾� �� interrupt -> InterruptedException
            //�۾� �� ���ܹ߻� -> ExecutionException
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
