package java_basic02.thread.ex301_daemon.test01;

public class Execute {
    public static void main(String[] args) {
        DaemonTh dm = new DaemonTh();
        dm.setDaemon(true);
        dm.start();

        System.out.println("데몬여부 : "+ dm.isDaemon());

        try {
            Thread.sleep(1000);
//            dm.interrupt();
        } catch (InterruptedException ie){
            ie.getMessage();
        }

        System.out.println("end");
    }
}
