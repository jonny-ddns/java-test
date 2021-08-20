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
            test.new Student("��ȿ��", Gender.MALE, 15),
            test.new Student("������", Gender.FEMALE, 73),
            test.new Student("�ΰ���", Gender.MALE, 92),
            test.new Student("������", Gender.FEMALE, 47)
        );

        //���� ������� ���ϱ�
        Predicate<Student> predicate_male = t -> t.gender.equals(Gender.MALE);
        double avgOfMale = test.getAverage(predicate_male);
        System.out.println("����������� : "+ avgOfMale);

        //60�� �̻��� ��� ��� ���ϱ�
        Predicate<Student> predicate_sixty = t -> t.score >= 60;
        double avgOver60 = test.getAverage(predicate_sixty);
        System.out.println("60���̻���� : "+ avgOver60);
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
