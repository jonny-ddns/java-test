package java_basic02.thread.ex202_yield;

public class ThreadB extends Thread {

    boolean stop = false;
    boolean work = true;

    @Override
    public void run() {
        while (!stop){
            if(work){
                System.out.println("ThreadB -       BBB");
                try {
                    sleep(500);
                } catch (InterruptedException ie){}
            } else{
                //�ٸ� �����忡 ���� �纸
                Thread.yield();
            }
        }
        System.out.println("ThreadB ����");
    }
}
