package java_basic02.thread.ex204_waitNotify.test02;

public class Execute {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();

        ProducerThread pro = new ProducerThread(dataBox);
        ConsumerThread con = new ConsumerThread(dataBox);

        pro.start();
        con.start();
    }
}
