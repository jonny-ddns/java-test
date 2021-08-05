package thread.ex205_interrupt.test01_stopFlag;

public class Execute {
    public static void main(String[] args) {
        ThreadEx threadEx = new ThreadEx();
        threadEx.start();

        try{
            Thread.sleep(1000);
            threadEx.setStop(true);
        } catch (InterruptedException ie){
            ie.getMessage();
        }
    }
}
