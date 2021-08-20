package java_basic02.thread.ex204_waitNotify.test02;

public class DataBox {
    private String data;

    public synchronized String getData(){
        if(this.data == null){
            try {
                wait();
            } catch (InterruptedException ie){
                ie.getMessage();
            }
        }
        String returnValue = data;
        System.out.println("consumer �� �н��ϴ� : "+ returnValue);
        data = null;
        notify();

        return returnValue;
    }

    public synchronized void setData(String data){
        if(this.data != null){
            try {
                wait();
            } catch (InterruptedException ie){
                ie.getMessage();
            }
        }
        this.data = data;
        System.out.println("producer �� ����ϴ� : "+ data);
        notify();
    }
}