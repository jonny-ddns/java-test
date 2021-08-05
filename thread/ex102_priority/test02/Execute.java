package thread.ex102_priority.test02;

public class Execute {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new PrioritySetting("MIN"));
        Thread thread02 = new Thread(new PrioritySetting("MAX"));
        Thread thread03 = new Thread(new PrioritySetting("NORM"));

        thread01.setPriority(Thread.MIN_PRIORITY);
        thread02.setPriority(Thread.MAX_PRIORITY);
        thread03.setPriority(Thread.NORM_PRIORITY);

        thread01.start();
        thread02.start();
        thread03.start();
    }
}
