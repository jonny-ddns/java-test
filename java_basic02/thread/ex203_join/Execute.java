package java_basic02.thread.ex203_join;

public class Execute {
    public static void main(String[] args) {
        MakeSum makeSum = new MakeSum(10);
        makeSum.start();

        try{
            //makeSum ������ ����� ������ ��ٸ���
            makeSum.join();
        } catch (InterruptedException ie){
            ie.getMessage();
        }
        System.out.println(makeSum.getSum());
    }
}
