package java_basic02.thread.ex203_join;

public class Execute {
    public static void main(String[] args) {
        MakeSum makeSum = new MakeSum(10);
        makeSum.start();

        try{
            //makeSum 실행이 종료될 때까지 기다리기
            makeSum.join();
        } catch (InterruptedException ie){
            ie.getMessage();
        }
        System.out.println(makeSum.getSum());
    }
}
