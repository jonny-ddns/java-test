package java_basic02.thread.ex204_waitNotify.test02;

public class ProducerThread extends Thread{

    private DataBox dataBox;

    public ProducerThread(DataBox dataBox){
        System.out.println(">>ProducerThread");
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for(int i=1; i<=3; i++){
            String data = "data-"+ i;
            dataBox.setData(data);
        }
    }
}
