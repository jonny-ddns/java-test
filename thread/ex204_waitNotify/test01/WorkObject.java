package thread.ex204_waitNotify.test01;

public class WorkObject {
    public synchronized void methodA(){
        System.out.println("threadA �۾�����");
        notify();
        try {
            wait();
        } catch (InterruptedException ie){
            ie.getMessage();
        }
    }

    public synchronized void methodB(){
        System.out.println("threadB �۾�����");
        notify();
        try {
            wait();
        } catch (InterruptedException ie){
            ie.getMessage();
        }
    }
}
