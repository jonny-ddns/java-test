package java_basic01.j20210616_inheritance_Interface.absractTest;

public abstract class Human {

    int a = 1;
    private int b = 2;
    protected int c = 3;
    public int d = 4;

    public Human(){
        System.out.println("human");
    }

//    private abstract void secret();

    protected abstract void love();

    protected abstract void sleep();

    public abstract void eat();

    private void secret(){
        System.out.println("secret");
    }
    void talk(){
        System.out.println("talk");
    }
    protected void dance(){
        System.out.println("dance");
    }
    public void work(){
        System.out.println("work");
    }
}
