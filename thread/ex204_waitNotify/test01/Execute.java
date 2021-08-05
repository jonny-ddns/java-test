package thread.ex204_waitNotify.test01;

public class Execute {
    public static void main(String[] args) {
        WorkObject sharing = new WorkObject();

        ThreadA a = new ThreadA(sharing);
        ThreadB b = new ThreadB(sharing);

        a.start();
        b.start();
    }

}
