package java_basic02.thread.ex102_priority.test01;

public class Execute {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new Run01());
        Thread thread02 = new Thread(new Run01());
        Thread thread03 = new Thread(new Run01());

        thread01.start();
        thread02.start();
        thread03.start();
        thread01.setPriority(3);
        System.out.println("getPriority : "+ thread01.getPriority());

        int pri = 0;
        thread01.setPriority(Thread.MIN_PRIORITY);
        pri = thread01.getPriority();
        System.out.println("--priority : "+ pri);

        thread01.setPriority(Thread.NORM_PRIORITY);
        pri = thread01.getPriority();
        System.out.println("--priority : "+ pri);

        thread01.setPriority(Thread.MAX_PRIORITY);
        pri = thread01.getPriority();
        System.out.println("--priority : "+ pri);
    }
}
