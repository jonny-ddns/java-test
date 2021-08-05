package thread.ex401_threadPool.ex02_스레드풀작업처리.test01;

public class Execute {
    public static void main(String[] args) {
        for(int i=0;i<20; i++){
            new ToDo().start();
        }
    }
}
