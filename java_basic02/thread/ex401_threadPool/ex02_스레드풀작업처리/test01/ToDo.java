package java_basic02.thread.ex401_threadPool.ex02_������Ǯ�۾�ó��.test01;

public class ToDo extends Thread{
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
