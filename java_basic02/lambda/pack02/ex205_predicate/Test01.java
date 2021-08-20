package java_basic02.lambda.pack02.ex205_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test01 {
    private List<Student> list;

    private enum Gender { MALE, FEMALE }

    class Student{
        private String name;
        private Gender gender;
        private int score;

        Student(String name, Gender gender, int score){
            this.name = name;
            this.gender = gender;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Test01 test = new Test01();

        test.list = Arrays.asList(
            test.new Student("박효신", Gender.MALE, 15),
            test.new Student("김윤아", Gender.FEMALE, 73),
            test.new Student("민경훈", Gender.MALE, 92),
            test.new Student("장혜진", Gender.FEMALE, 47)
        );

        //남성 평균점수 구하기
        Predicate<Student> predicate_male = t -> t.gender.equals(Gender.MALE);
        double avgOfMale = test.getAverage(predicate_male);
        System.out.println("남성점수평균 : "+ avgOfMale);

        //60점 이상일 경우 평균 구하기
        Predicate<Student> predicate_sixty = t -> t.score >= 60;
        double avgOver60 = test.getAverage(predicate_sixty);
        System.out.println("60점이상평균 : "+ avgOver60);
    }

    private double getAverage(Predicate<Student> predicate){
        int count = 0;
        int sum = 0;
        for (Student stu : list){
            if(predicate.test(stu)){
                count++;
                sum += stu.score;
            }
        }
        return (double) sum/count;
    }
}
