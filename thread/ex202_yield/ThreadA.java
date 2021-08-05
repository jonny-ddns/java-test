package thread.ex202_yield;

public class ThreadA extends Thread{

    boolean stop = false;
    boolean work = true;

    @Override
    public void run() {
        while (!stop){
            if(work){
                System.out.println("ThreadA - AAA");
                try {
                    sleep(500);
                } catch (InterruptedException ie){}
            } else{
                //다른 스레드에 실행 양보
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");
    }
}
