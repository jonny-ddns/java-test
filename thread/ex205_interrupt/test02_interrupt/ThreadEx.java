package thread.ex205_interrupt.test02_interrupt;

public class ThreadEx extends Thread{
    @Override
    public void run() {
        try{
            while(true){
                System.out.println("실행 ing");
                Thread.sleep(1);        //interrupt() 메서드 사용을 위해 일부러 짧은시간 일시정지시킴
            }
        } catch (InterruptedException ie){
            ie.getMessage();
        }
        System.out.println("스레드 자원해제");
    }
}
