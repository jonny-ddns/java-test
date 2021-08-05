package thread.ex301_daemon.test01;

public class DaemonTh extends Thread{
    void whileDaemonRunning(){
        System.out.println("���󽺷��� ������");
    }
    void ifInterrupted(){
        System.out.println("���󽺷��� interrupted");
    }
    void ifDaemonGone(){
        System.out.println("���󽺷��� ����");
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
