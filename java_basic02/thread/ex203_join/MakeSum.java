package java_basic02.thread.ex203_join;

public class MakeSum extends Thread{
    private int sum = 0;
    private int index = 0;

    MakeSum(){
        this(10);
    }

    MakeSum(int index){
        this.index = index;
    }

    @Override
    public void run() {
        for(int i=1; i<=index; i++){
            sum += i;
        }
    }

    public int getSum(){
        return sum;
    }
}
