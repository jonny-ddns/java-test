package thread.ex401_threadPool.ex02_������Ǯ�۾�ó��.test03_execute;

public class Todo implements Runnable {
    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+ " | �۾�");
            Thread.sleep(200);
        } catch (InterruptedException ie){
            ie.getMessage();
        }
    }
}
