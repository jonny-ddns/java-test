package _past.j20210616_inheritance_Interface.absractTest;

public class mainClass {
    public static void main(String[] args) {
        Human human01 = new Human() {
            @Override
            protected void love() {

            }

            @Override
            protected void sleep() {

            }

            @Override
            public void eat() {

            }
        };

        Human human02 = new Korean() {
            @Override
            void iloveKorea() {

            }

            @Override
            protected void love() {

            }

            @Override
            protected void sleep() {

            }

            @Override
            public void eat() {

            }
        };

        Human yuna = new K_player();

//        yuna.secret();    //���� �Ұ�
        yuna.talk();
        yuna.dance();
        yuna.work();

        yuna.a = 1;
//        yuna.b = 2;       //���� �Ұ�
        yuna.c = 3;
        yuna.d = 4;

//        Student stu01 = new Student() {
//            @Override
//            protected void love() {
//
//            }
//
//            @Override
//            protected void sleep() {
//
//            }
//
//            @Override
//            public void eat() {
//
//            }
//        };

    }
}
