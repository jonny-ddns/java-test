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
        Student st1 = test.new Student(123, "ȫ�浿", 11, 36);

        //���� : Student��ü - Student�� Integer ��
        Function<Student, Integer> function = a -> a.stuNum;
        int result01 = function.apply(st1);
        System.out.println("ȫ�浿 ��ȣ : "+ result01);


        //���� : �� Integer �� - Double ��
        BiFunction<Integer, Integer, Double> biFunction = (a, b) -> (double) (a+b)/2;
        double result02 = biFunction.apply(3, 5);
        System.out.println("�� ���� ��� : "+ result02);


        //���� : Double �� - Integer ��
        DoubleFunction<Integer> doubleFunction = a -> {
            Double d = Math.floor(a);
            return d.intValue();
        };
        int result03 = doubleFunction.apply(246.71);
        System.out.println("�Ҽ��� ������ : "+ result03);


        //���� : Integer, Integer - Double
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction;
        toDoubleBiFunction = (math, english) -> (double)(math+english)/2;
        double result04 = toDoubleBiFunction.applyAsDouble(st1.math, st1.english);
        System.out.println("ȫ�浿�� ���� ���� ��� : "+ result04);
    }
}
