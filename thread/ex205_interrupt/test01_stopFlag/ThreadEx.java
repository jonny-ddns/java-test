package thread.ex205_interrupt.test01_stopFlag;

public class ThreadEx extends Thread{
    private boolean stop;
    
    public void setStop(boolean stop){
        this.stop = stop;
    }

    @Override
    public void run() {
        while(!stop){
            System.out.println("���� ing");
        }
        System.out.println("������ �ڿ�����");
    }
}
