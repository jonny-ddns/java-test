package thread.ex101_create.ex02_runnableImplement;

public class Mains {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.run();
        
        Runnable test02 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run test runnable");
            }
        };
        test02.run();
    }

}
