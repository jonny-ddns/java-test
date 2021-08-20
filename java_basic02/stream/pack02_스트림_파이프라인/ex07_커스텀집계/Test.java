package java_basic02.stream.pack02_스트림_파이프라인.ex07_커스텀집계;

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
            t.new Student("홍길동", 35),
            t.new Student("최길동", 26),
            t.new Student("허길동", 15),
            t.new Student("박길동", 96),
            t.new Student("김길동", 68)
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
