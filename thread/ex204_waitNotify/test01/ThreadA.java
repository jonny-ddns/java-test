package thread.ex204_waitNotify.test01;

public class ThreadA extends Thread{
    private WorkObject wObject = null;

    public ThreadA(WorkObject wObject){
        this.wObject = wObject;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            wObject.methodA();
        }
    }
}
