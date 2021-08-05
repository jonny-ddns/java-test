package thread.ex401_threadPool.ex03_�뺸.test01_blocking.t1_���ϰ���_����_�뺸;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test02 {

    int num = 1;
    Test02(){
        this(10);
    }
    Test02(int num){
        this.num = num;
    }

    Runnable runTodo = new Runnable() {
        @Override
        public void run() {
            int answer = 0;
            answer = num*num;
            System.out.println("answer : "+ answer);
        }
    };

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Future future = service.submit(new Test02(5).runTodo);

        try{
            //����ó���Ǹ� null ����
            //�۾� �� interrupt -> InterruptedException
            //�۾� �� ���ܹ߻� -> ExecutionException
            future.get();
            System.out.println("future.isDone() : "+ future.isDone());
        } catch (InterruptedException ie){
            ie.getMessage();
        } catch (ExecutionException ee){
            ee.getMessage();
        } catch (Exception e){
            e.getMessage();
        }
        service.shutdown();
    }
}
