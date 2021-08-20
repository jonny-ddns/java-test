package java_basic02.thread.ex204_waitNotify.test03;

//Ã¶¼ö
public class ThreadGiver extends Thread {
    private Propose propose;
    private int count;

    public ThreadGiver(Propose propose, int count){
        this.propose = propose;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1; i<=count; i++){
            String data = propose.getPropose();
        }
    }
}
