package java_basic02.stream.pack02_스트림_파이프라인.ex04_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        IntStream intStream = Arrays.stream(new int[]{2, 64, 37, 19, 82});
        System.out.println("--int[] 오름차순 정렬하기");
        intStream.sorted()
                .forEach(a -> System.out.print(a+ " "));

        System.out.println();
        List<Student> list = Arrays.asList(
            t.new Student("홍길동", 35),
            t.new Student("최길동", 26),
            t.new Student("허길동", 15),
            t.new Student("박길동", 96),
            t.new Student("김길동", 68)
        );

        System.out.println("--List - Student 기준에 따라 정렬하기");
        list.stream()
            .sorted()
            .forEach(a-> System.out.println( "이름: "+ a.getName()+ " | 점수: "+  a.getScore()) );

        System.out.println("--List - Student 기준 반대로 정렬하기");
        list.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(a-> System.out.println( "이름: "+ a.getName()+ " | 점수: "+  a.getScore()) );
    }

    //Comparable 구현객체
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

        //compareTo 오버라이드 해서 정렬기준(=점수) 제시
        @Override
        public int compareTo(Student o) {
            return Integer.compare(score, o.score);
        }
    }
}
