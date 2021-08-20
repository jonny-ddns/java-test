package java_basic02.thread.ex401_threadGroup.test01_group;

public class Employee extends Thread{
    //생성자 인자값으로 스레드 그룹 생성하기
    Employee(ThreadGroup threadGroup, String threadName){
        super(threadGroup, threadName);
    }

    @Override
    public void run() {
        while (true){   //무한반복
            try {
                //interrupt() 메서드는 일시정지 상태에서 호출되기 때문에
                //일부러 sleep 호출
                Thread.sleep(100);
            } catch(InterruptedException ie){
                System.out.println(getName() + " is interrupted");
                ie.getMessage();
                break;
            }
        }
    }
}
