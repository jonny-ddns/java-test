package java_basic02.stream.pack02_��Ʈ��_����������.ex04_����;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        IntStream intStream = Arrays.stream(new int[]{2, 64, 37, 19, 82});
        System.out.println("--int[] �������� �����ϱ�");
        intStream.sorted()
                .forEach(a -> System.out.print(a+ " "));

        System.out.println();
        List<Student> list = Arrays.asList(
            t.new Student("ȫ�浿", 35),
            t.new Student("�ֱ浿", 26),
            t.new Student("��浿", 15),
            t.new Student("�ڱ浿", 96),
            t.new Student("��浿", 68)
        );

        System.out.println("--List - Student ���ؿ� ���� �����ϱ�");
        list.stream()
            .sorted()
            .forEach(a-> System.out.println( "�̸�: "+ a.getName()+ " | ����: "+  a.getScore()) );

        System.out.println("--List - Student ���� �ݴ�� �����ϱ�");
        list.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(a-> System.out.println( "�̸�: "+ a.getName()+ " | ����: "+  a.getScore()) );
    }

    //Comparable ������ü
    class Student implements Comparable<Student>{
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

        //compareTo �������̵� �ؼ� ���ı���(=����) ����
        @Override
        public int compareTo(Student o) {
            return Integer.compare(score, o.score);
        }
    }
}
