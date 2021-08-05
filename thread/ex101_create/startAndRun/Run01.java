package thread.ex101_create.startAndRun;

public class Run01 implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            String name = Thread.currentThread().getName();
            System.out.println(name+ "ÀÇ count : "+ (i+1));
        }
    }
}
