package java_basic02.finalEx;

public class MainEx {
    public static void main(String[] args) {
        Bird bird01 = new Bird();
        bird01.fiy();
        bird01.sing();
        Bird.wake();
        System.out.println();

        Sparrow sparrow = new Sparrow();
        sparrow.fiy();
        sparrow.sing();
        sparrow.wake();
        System.out.println();

        int foot = sparrow.footCount;
        System.out.println("다리 개수 : "+ foot);
    }
}
