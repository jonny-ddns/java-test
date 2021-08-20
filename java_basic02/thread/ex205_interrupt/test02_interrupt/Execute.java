package java_basic02.thread.ex205_interrupt.test02_interrupt;

public class Execute {
    public static void main(String[] args) {
        ThreadEx threadEx = new ThreadEx();
        threadEx.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.getMessage();
        }
        threadEx.interrupt();
    }
}