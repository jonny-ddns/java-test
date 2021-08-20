package java_basic02.thread.ex204_waitNotify.test03;

public class Execute {
    public static void main(String[] args) {
        Propose propose = new Propose();
        int count = 5;

        ThreadReceiver pro = new ThreadReceiver(propose, count);
        ThreadGiver con = new ThreadGiver(propose, count);

        pro.start();
        con.start();
    }
}
