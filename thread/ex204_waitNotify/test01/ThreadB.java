package thread.ex204_waitNotify.test01;

public class ThreadB extends Thread {
    private WorkObject wObject = null;

    public ThreadB(WorkObject wObject){
        this.wObject = wObject;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            wObject.methodB();
        }
    }
}
