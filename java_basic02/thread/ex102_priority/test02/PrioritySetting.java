package java_basic02.thread.ex102_priority.test02;

public class PrioritySetting extends Thread{
    PrioritySetting(String name){
        super(name);
    }

    @Override
    public void run() {
        String name  = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();

        System.out.println(name+ " | "+ priority);
    }
}
