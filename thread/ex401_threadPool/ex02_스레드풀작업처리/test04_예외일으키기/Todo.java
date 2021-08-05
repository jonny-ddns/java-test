package thread.ex401_threadPool.ex02_스레드풀작업처리.test04_예외일으키기;

public class Todo implements Runnable {

    String st = null;
    Todo(String st){
        this.st = st;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " run 실행");
        int changed = changeInteger(st);
        System.out.println("리턴 : "+ changed);
    }

    //예외 발생시키는 코드
    int changeInteger(String str){
        return Integer.parseInt(str);
    }
}
