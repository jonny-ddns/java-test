package lambda.pack02.ex203_function;

import java.util.Arrays;
import java.util.List;

import java.util.function.ToIntFunction;

public class Test02 {
    class Student{
        private int stuNum;
        private String stuName;
        private int math;
        private int english;

        Student(int stuNum, String stuName, int math, int english){
            this.stuNum = stuNum;
            this.stuName = stuName;
            this.math = math;
            this.english = english;
        }
    }

    public static void main(String[] args) {
        Test02 test = new Test02();

        List<Student> list = Arrays.asList(
            test.new Student(11, "������", 27, 22),
            test.new Student(13, "���ð�", 37, 26),
            test.new Student(14, "�̽�ö", 36, 81),
            test.new Student(15, "�̼���", 37, 29)
        );


        //���� : Student - ��������
        ToIntFunction<Student> toIntFunction_math = student -> student.math;
        //���� : Student - ��������
        ToIntFunction<Student> toIntFunction_english = student -> student.english;


        System.out.println("--�������� ��������");
        for(Student stu : list){
            int math = test.getScore(toIntFunction_math, stu);
            System.out.print(math+ " ");
        }

        System.out.println("\n--�������� ��������");
        for(Student stu : list){
            int english = test.getScore(toIntFunction_english, stu);
            System.out.print(english+ " ");
        }

    }
    //�޼��� : function�� �ش��ϴ� ���� ������ ��ȯ�ϱ�
    public int getScore(ToIntFunction toIntFunction, Student student){
        int score = toIntFunction.applyAsInt(student);
        return score;
    }
}
