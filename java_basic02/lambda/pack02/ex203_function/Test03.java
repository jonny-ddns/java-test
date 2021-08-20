package java_basic02.lambda.pack02.ex203_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Test03 {
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

        public int getMath(){
            return math;
        }
        public int getEnglish(){
            return english;
        }
    }

    public static void main(String[] args) {
        Test03 test = new Test03();

        List<Student> list = Arrays.asList(
                test.new Student(11, "������", 27, 22),
                test.new Student(13, "���ð�", 37, 26),
                test.new Student(14, "�̽�ö", 36, 81),
                test.new Student(15, "�̼���", 37, 29)
        );

        //���� : ����, ���� --> �������
        ToDoubleFunction<Student> toDoubleFunction =
                student -> (double)(student.getMath() + student.getEnglish())/2;
        //�޼��忡 �� �ֱ�
        test.testT(toDoubleFunction, list);
    }

    void testT(ToDoubleFunction function, List<Student> list){
        double sum = 0;
        for(Student stu : list){

            double score = function.applyAsDouble(stu);
            System.out.println(stu.stuName+ "�� ������� : "+ score);
            sum += score;
        }
        double stuAverage = sum/list.size();
        System.out.println("���� �� ��� : "+ stuAverage);
    }
}