package java_basic02.thread.ex401_threadGroup.test01_group;

public class Employee extends Thread{
    //������ ���ڰ����� ������ �׷� �����ϱ�
    Employee(ThreadGroup threadGroup, String threadName){
        super(threadGroup, threadName);
    }

    @Override
    public void run() {
        while (true){   //���ѹݺ�
            try {
                //interrupt() �޼���� �Ͻ����� ���¿��� ȣ��Ǳ� ������
                //�Ϻη� sleep ȣ��
                Thread.sleep(100);
            } catch(InterruptedException ie){
                System.out.println(getName() + " is interrupted");
                ie.getMessage();
                break;
            }
        }
    }
}
