package thread.ex401_threadPool.ex03_통보.test02_callback;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackEx {

    private ExecutorService executorService;

    public CallbackEx(){
        executorService = Executors.newFixedThreadPool(8);
    }

    private CompletionHandler<Integer, Void> callback =
            new CompletionHandler<Integer, Void>() {
                @Override
                public void completed(Integer result, Void attachment) {
                    System.out.println("completed - "+ result);
                }

                @Override
                public void failed(Throwable exc, Void attachment) {
                    System.out.println("failed - "+ exc.toString());
                }
            };

    public void doWork(final String x, final String y){

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);
                    int result = intX + intY;
                    callback.completed(result, null);
                } catch (NumberFormatException nf){
                    callback.failed(nf, null);
                } catch (Exception e){
                    e.getMessage();
                }
            }
        };
        executorService.submit(task);
    }

    public void finish(){
        executorService.shutdown();
        boolean isShut = executorService.isShutdown();
        System.out.println("executorService 종료여부 : "+ isShut);
    }

    public static void main(String[] args) {
        CallbackEx instance = new CallbackEx();
//        instance.doWork("3", "5");
        instance.doWork("7", "홍길동");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie){
            ie.getMessage();
        }
        instance.finish();
    }
}
