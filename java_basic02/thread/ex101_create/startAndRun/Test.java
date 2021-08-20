package java_basic02.thread.ex101_create.startAndRun;

public class Test {

    void runTest(){
        System.out.println(">>runTest()");
        Run01 run01 = new Run01();
        run01.run();
    }

    public static void main(String[] args) {
        Run01 run01 = new Run01();
        Thread th01 = new Thread(run01);
        Thread th02 = new Thread(run01);
        Thread th03 = new Thread(run01);


        th01.run();
        th01.run();
        th01.run();
        System.out.println();

        th01.run();
        th02.run();
        th03.run();
        System.out.println();

//        th01.start();
//        th02.start();
//        th03.start();

        Test t = new Test();
        t.runTest();



        Run02 run02 = new Run02();
        run02.runTest();

        Thread th15 = new Thread();
        th15.run();

        Thread th16 = new Thread(run01);
        th16.run();
    }
}
