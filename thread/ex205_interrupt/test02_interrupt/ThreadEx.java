package thread.ex205_interrupt.test02_interrupt;

public class ThreadEx extends Thread{
    @Override
    public void run() {
        try{
            while(true){
                System.out.println("���� ing");
                Thread.sleep(1);        //interrupt() �޼��� ����� ���� �Ϻη� ª���ð� �Ͻ�������Ŵ
            }
        } catch (InterruptedException ie){
            ie.getMessage();
        }
        System.out.println("������ �ڿ�����");
    }
}
