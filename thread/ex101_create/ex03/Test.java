package thread.ex101_create.ex03;

public class Test {
    class ThirdThread extends Thread{
        @Override
        public void run() {
            System.out.println("3");
        }
    }

    class fourthThread implements Runnable{
        @Override
        public void run() {
            System.out.println("4");
        }
    }

    public static void main(String[] args) {
        
        /*
        아래 스레드는 실행할 때마다 출력되는 순서가 다르다
         */
        Test t = new Test();
        
        
        //스레드1 - Thr 
        FirstThread th1 = new FirstThread();
        th1.start();

        //스레드2
        SecondThread sec_thread = new SecondThread();
        Thread th2 = new Thread(sec_thread);
        th2.start();

        //스레드3
        ThirdThread th3 = t.new ThirdThread();
        th3.start();

        //스레드4
        Thread th4 = new Thread(t.new fourthThread());
        th4.start();
//        new Thread(t.new fourthThread()).start();

        //스레드5 - 익명 객체방식으로 선언
        Thread th5 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("5");
                    }
                }
        );
        th5.start();

//        String name1 = th1.getName();
//        String name2 = th2.getName();
//        String name3 = th3.getName();
//        String name4 = th4.getName();
//        String name5 = th5.getName();
//
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//        System.out.println(name4);
//        System.out.println(name5);


    }
}
