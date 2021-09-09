package java_basic03.ex01_interface;

public interface Test {

    //���� ����
    public int int1 = 0;
    int int2 = 1;

    //static ����
    public static String str1 = "test";
    static String str2 = "test";

    //final ���� ����
    final String final1 = "test";
    static final String final2 = "test";
    public static final String final3 = "test";

    //�޼���
    void act01();

    public void act02();

    static void act03() {    //static �޼���� body�� �־�� �Ѵ�
    }

    static public void act04() {
    }

    //�Ű��� �ִ� �޼���
    void act11(int i);

    public void act12(int i);

    static void act13(int i) {    //static �޼���� body�� �־�� �Ѵ�
    }

    static public void act14(int i) {
    }

    //enum
    enum COFFEE{ AMERICANO, LATTE, CAPPUCCINO }
    public enum PET{ PUPPY, KITTY, LAMB }

    //���� Ŭ����
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

    //��ø Ŭ����
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
