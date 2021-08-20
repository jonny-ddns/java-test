package java_basic02.stream.pack02_��Ʈ��_����������.ex07_Ŀ��������;

import java.util.Arrays;
import java.util.List;

public class Test {
    class Student{
        private String name;
        private int score;

        private Student(String name, int score){
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }
        public int getScore() {
            return score;
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        List<Student> list = Arrays.asList(
            t.new Student("ȫ�浿", 35),
            t.new Student("�ֱ浿", 26),
            t.new Student("��浿", 15),
            t.new Student("�ڱ浿", 96),
            t.new Student("��浿", 68)
        );

        int sum1 = list.stream()
                .mapToInt(Student :: getScore)
                .sum();


        int sum2 = list.stream()
                .map(Student :: getScore)
                .reduce((a, b) -> a+b)
                .get();

        int sum3 = list.stream()
                .map(Student :: getScore)
                .reduce(0, (a, b) -> a+b);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
