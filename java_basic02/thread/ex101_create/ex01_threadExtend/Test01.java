package java_basic02.thread.ex101_create.ex01_threadExtend;

public class Test01 extends Thread{

    @Override
    public void run() {
        System.out.println("java_basic02/scannerTest");
        String name = getName();
        System.out.println(name);
        setName("���� ������ �̸�");
        String newName = getName();
        System.out.println(newName);
    }
}