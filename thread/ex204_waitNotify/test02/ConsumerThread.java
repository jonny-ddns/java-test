package thread.ex204_waitNotify.test02;

public class ConsumerThread extends Thread {
    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox){
        System.out.println(">>ConsumerThread");
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for(int i=1; i<=3; i++){
            String data = dataBox.getData();
        }
    }
}
