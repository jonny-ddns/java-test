package thread.ex202_yield;

public class Execute {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        a.start();
        b.start();

        try{
            Thread.sleep(2000);
        } catch (InterruptedException ie){ ie.getMessage(); }

        //a 일시정지
        a.work = false;

        try{
            Thread.sleep(1000);
        } catch (InterruptedException ie){ ie.getMessage(); }

        //a 실행 재개
        a.work = true;

        try{
            Thread.sleep(2000);
        } catch (InterruptedException ie){ ie.getMessage(); }

        //b 일시정지
        b.work = false;

        //a, b 실행종료
        a.stop = true;
        b.stop = true;
    }
}
