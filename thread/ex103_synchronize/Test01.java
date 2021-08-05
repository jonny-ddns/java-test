package thread.ex103_synchronize;

//�� ��ݽ� ����ȭ�Ǵ� ����
public class Test01 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread a = new Thread(atm, "ö��");
        Thread b = new Thread(atm, "����");

        a.start();
        b.start();
    }
}

class ATM implements Runnable{
    private int deposit = 10000;    //���� �ܾ�
    @Override
    public void run() {
        synchronized (this){        //synchronize �����Ͽ� �Ӱ迵�� ����
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
            System.out.println(Thread.currentThread().getName()+ "�� ����մϴ�. �ܾ� : "+ getMoney());
        } else {
            System.out.println(Thread.currentThread().getName()+ "�ܾ׺���");
        }
    }

    public int getMoney(){
        return deposit;
    }
}