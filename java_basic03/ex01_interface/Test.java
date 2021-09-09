package java_basic03.ex01_interface;

public interface Test {

    //변수 선언
    public int int1 = 0;
    int int2 = 1;

    //static 변수
    public static String str1 = "test";
    static String str2 = "test";

    //final 변수 선언
    final String final1 = "test";
    static final String final2 = "test";
    public static final String final3 = "test";

    //메서드
    void act01();

    public void act02();

    static void act03() {    //static 메서드는 body가 있어야 한다
    }

    static public void act04() {
    }

    //매개값 있는 메서드
    void act11(int i);

    public void act12(int i);

    static void act13(int i) {    //static 메서드는 body가 있어야 한다
    }

    static public void act14(int i) {
    }

    //enum
    enum COFFEE{ AMERICANO, LATTE, CAPPUCCINO }
    public enum PET{ PUPPY, KITTY, LAMB }

    //내부 클래스
    class Inner {
        private int score;
        public Inner(int num) {
            this.score = num;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }

    //중첩 클래스
    static class Nested {
        private int grade;
        public Nested(int num) {
            this.grade = num;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    }
}
