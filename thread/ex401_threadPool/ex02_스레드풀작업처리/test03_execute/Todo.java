package thread.ex401_threadPool.ex02_스레드풀작업처리.test03_execute;

public class Todo implements Runnable {
    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+ " | 작업");
            Thread.sleep(200);
        } catch (InterruptedException ie){
            ie.getMessage();
        }
    }
}
