package stream.pack02_��Ʈ��_����������.ex03_����;

import java.util.Arrays;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        Test02 test = new Test02();
        List<Student> list = Arrays.asList(
            test.new Student("ȫ�浿", 91),
            test.new Student("�̹���", 64),
            test.new Student("�����", 72)
        );

        list.stream()
            .mapToInt(Student :: getScore)
            .forEach(a -> System.out.println("���� : "+ a));
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
