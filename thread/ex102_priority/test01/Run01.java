package thread.ex102_priority.test01;

public class Run01 implements Runnable{
    @Override
    public void run() {
        System.out.println("id : "+ Thread.currentThread().getId());
        System.out.println("name : "+ Thread.currentThread().getName());
        System.out.println("priority : "+ Thread.currentThread().getPriority());
        System.out.println();
    }
}
