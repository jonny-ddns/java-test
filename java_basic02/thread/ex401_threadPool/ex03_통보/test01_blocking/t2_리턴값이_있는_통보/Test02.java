package java_basic02.thread.ex401_threadPool.ex03_통보.test01_blocking.t2_리턴값이_있는_통보;

import java.util.concurrent.*;

public class Test02 {

    int num = 1;
    Test02(){
        this(10);
    }
    Test02(int num){
        this.num = num;
    }

    Callable runTodo = new Callable() {
        @Override
        public Integer call() throws Exception {
            int answer = 0;
            answer = num*num;
            return answer;
        }
    };

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(16);
        Future<Integer> future = service.submit(new Test02(5).runTodo);

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
        service.shutdown();
    }
}
