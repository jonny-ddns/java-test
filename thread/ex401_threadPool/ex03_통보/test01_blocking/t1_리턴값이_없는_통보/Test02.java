package thread.ex401_threadPool.ex03_통보.test01_blocking.t1_리턴값이_없는_통보;

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
            //정상처리되면 null 리턴
            //작업 중 interrupt -> InterruptedException
            //작업 중 예외발생 -> ExecutionException
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
