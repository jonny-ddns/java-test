package thread.ex204_waitNotify.test01;

public class WorkObject {
    public synchronized void methodA(){
        System.out.println("threadA 작업시작");
        notify();
        try {
            wait();
        } catch (InterruptedException ie){
            ie.getMessage();
        }
    }

    public synchronized void methodB(){
        System.out.println("threadB 작업시작");
        notify();
        try {
            wait();
        } catch (InterruptedException ie){
            ie.getMessage();
        }
    }
}
