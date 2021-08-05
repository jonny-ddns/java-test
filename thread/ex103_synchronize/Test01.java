package thread.ex103_synchronize;

//돈 출금시 동기화되는 예제
public class Test01 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread a = new Thread(atm, "철수");
        Thread b = new Thread(atm, "영희");

        a.start();
        b.start();
    }
}

class ATM implements Runnable{
    private int deposit = 10000;    //계좌 잔액
    @Override
    public void run() {
        synchronized (this){        //synchronize 선언하여 임계영역 설정
            for(int i=0; i<5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.getMessage();
                }
                if (getMoney() <= 0) {
                    break;
                }
                withdraw(1000);
            }
        }
    }

    public void withdraw(int money){
        if(getMoney() > 0){
            deposit -= money;
            System.out.println(Thread.currentThread().getName()+ "가 출금합니다. 잔액 : "+ getMoney());
        } else {
            System.out.println(Thread.currentThread().getName()+ "잔액부족");
        }
    }

    public int getMoney(){
        return deposit;
    }
}