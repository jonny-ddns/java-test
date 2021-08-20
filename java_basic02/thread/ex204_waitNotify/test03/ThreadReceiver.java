package java_basic02.thread.ex204_waitNotify.test03;

//¿µÈñ
public class ThreadReceiver extends Thread{
    private Propose propose;
    private int count;

    public ThreadReceiver(Propose propose, int count){
        this.propose = propose;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<count; i++){
            String data = (i+1)+ "¹øÂ°";
            propose.setPropose(data);
        }
    }
}