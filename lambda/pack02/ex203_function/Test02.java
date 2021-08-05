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
            test.new Student(11, "조성모", 27, 22),
            test.new Student(13, "성시경", 37, 26),
            test.new Student(14, "이승철", 36, 81),
            test.new Student(15, "이수영", 37, 29)
        );


        //매핑 : Student - 수학점수
        ToIntFunction<Student> toIntFunction_math = student -> student.math;
        //매핑 : Student - 영어점수
        ToIntFunction<Student> toIntFunction_english = student -> student.english;


        System.out.println("--수학점수 가져오기");
        for(Student stu : list){
            int math = test.getScore(toIntFunction_math, stu);
            System.out.print(math+ " ");
        }

        System.out.println("\n--영어점수 가져오기");
        for(Student stu : list){
            int english = test.getScore(toIntFunction_english, stu);
            System.out.print(english+ " ");
        }

    }
    //메서드 : function에 해당하는 과목 점수를 반환하기
    public int getScore(ToIntFunction toIntFunction, Student student){
        int score = toIntFunction.applyAsInt(student);
        return score;
    }
}
