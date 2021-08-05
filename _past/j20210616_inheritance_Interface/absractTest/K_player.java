package _past.j20210616_inheritance_Interface.absractTest;

public class K_player extends Korean{

    @Override
    protected void love() {
        System.out.println("K_player - love");
    }

    @Override
    protected void sleep() {
        System.out.println("K_player - sleep");
    }

    @Override
    public void eat() {
        System.out.println("K_player - eat");
    }

    @Override
    void iloveKorea() {
        System.out.println("K_player - iloveKorea");
    }
}
