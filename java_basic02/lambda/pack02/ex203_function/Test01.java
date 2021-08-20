package java_basic02.lambda.pack02.ex203_function;

//    DoubleFunction<Integer> doubleFunction;
//    IntFunction intFunction;
//    IntToDoubleFunction intToDoubleFunction;
//    IntToLongFunction intToLongFunction;
//    LongToIntFunction longToIntFunction;
//    ToDoubleBiFunction toDoubleBiFunction;
//    ToDoubleFunction toDoubleFunction;
//    ToIntBiFunction toIntBiFunction;
//    ToIntFunction toIntFunction;
//    ToLongBiFunction toLongBiFunction;
//    ToLongFunction toLongFunction;


import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;

public class Test01 {
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
        Test01 test = new Test01();
        Student st1 = test.new Student(123, "홍길동", 11, 36);

        //매핑 : Student객체 - Student의 Integer 값
        Function<Student, Integer> function = a -> a.stuNum;
        int result01 = function.apply(st1);
        System.out.println("홍길동 번호 : "+ result01);


        //매핑 : 두 Integer 값 - Double 값
        BiFunction<Integer, Integer, Double> biFunction = (a, b) -> (double) (a+b)/2;
        double result02 = biFunction.apply(3, 5);
        System.out.println("두 숫자 평균 : "+ result02);


        //매핑 : Double 값 - Integer 값
        DoubleFunction<Integer> doubleFunction = a -> {
            Double d = Math.floor(a);
            return d.intValue();
        };
        int result03 = doubleFunction.apply(246.71);
        System.out.println("소수점 버리기 : "+ result03);


        //매핑 : Integer, Integer - Double
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction;
        toDoubleBiFunction = (math, english) -> (double)(math+english)/2;
        double result04 = toDoubleBiFunction.applyAsDouble(st1.math, st1.english);
        System.out.println("홍길동의 수학 영어 평균 : "+ result04);
    }
}
