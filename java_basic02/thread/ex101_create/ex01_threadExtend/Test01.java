package java_basic02.thread.ex101_create.ex01_threadExtend;

public class Test01 extends Thread{

    @Override
    public void run() {
        System.out.println("java_basic02/scannerTest");
        String name = getName();
        System.out.println(name);
        setName("새로 생성한 이름");
        String newName = getName();
        System.out.println(newName);
    }
}
