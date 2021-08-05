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

        //a �Ͻ�����
        a.work = false;

        try{
            Thread.sleep(1000);
        } catch (InterruptedException ie){ ie.getMessage(); }

        //a ���� �簳
        a.work = true;

        try{
            Thread.sleep(2000);
        } catch (InterruptedException ie){ ie.getMessage(); }

        //b �Ͻ�����
        b.work = false;

        //a, b ��������
        a.stop = true;
        b.stop = true;
    }
}
