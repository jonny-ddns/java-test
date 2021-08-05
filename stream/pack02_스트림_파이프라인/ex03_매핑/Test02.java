package stream.pack02_스트림_파이프라인.ex03_매핑;

import java.util.Arrays;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        Test02 test = new Test02();
        List<Student> list = Arrays.asList(
            test.new Student("홍길동", 91),
            test.new Student("이민형", 64),
            test.new Student("김기준", 72)
        );

        list.stream()
            .mapToInt(Student :: getScore)
            .forEach(a -> System.out.println("점수 : "+ a));
    }

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
}
