package thread.ex301_daemon.test01;

public class DaemonTh extends Thread{
    void whileDaemonRunning(){
        System.out.println("데몬스레드 실행중");
    }
    void ifInterrupted(){
        System.out.println("데몬스레드 interrupted");
    }
    void ifDaemonGone(){
        System.out.println("데몬스레드 종료");
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(200);
                whileDaemonRunning();
            } catch (InterruptedException ie){
                ifInterrupted();
                ie.getMessage();
                break;
            }
        }
        ifDaemonGone();
    }
}
