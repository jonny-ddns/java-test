package lambda.pack02.ex204_operator;

//        BinaryOperator binaryOperator;
//        IntBinaryOperator intBinaryOperator;
//        DoubleBinaryOperator doubleBinaryOperator;
//        IntUnaryOperator intUnaryOperator;
//        LongBinaryOperator longBinaryOperator;
//        LongUnaryOperator longUnaryOperator;
//        UnaryOperator unaryOperator;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Test02 {
    int[] numbers = {3, 1, 7, 6, 5};
    double[] celciousArr = {25, 37, 100, 0};

    //함수적 인터페이스를 받아 최댓값을 구하는 메서드
    int getMax(IntBinaryOperator operator){
        int result = numbers[0];
        //int[] 반복 돌면서 지정한 operator 연산수행 -> 연산결과 리턴
        for(int number : numbers){
            result = operator.applyAsInt(result, number);
        }
        return result;
    }

    //함수적 인터페이스를 받아 제곱값을 구하는 메서드
    int[] getSquare(IntUnaryOperator operator){
        int[] intArr = new int[numbers.length];

        for(int i = 0; i< numbers.length; i++){
            intArr[i] = operator.applyAsInt(numbers[i]);
        }
        return intArr;
    }

    //함수적 인터페이스를 받아 섭씨를 화씨로 바꾸는 메서드
    void getSumOfMultiple(UnaryOperator<Double> operator){
        int sum = 0;
        for(double celcious : celciousArr){
            double fahrenheit = operator.apply(celcious);
            System.out.print(fahrenheit+ " ");
        }
    }

    public static void main(String[] args) {
        Test02 test = new Test02();

        //연산식 설정 - 최댓값
        int max = test.getMax(
            (a, b) -> {
                int number = a;
                if (a < b) number = b;
                return number;
            }
        );
        System.out.println("최댓값 : "+ max);

        //연산식 설정 - 제곱값
        System.out.print("제곱값 : ");
        int[] intArr = test.getSquare( a -> a*a );
        for(int d : intArr){
            System.out.print(d + " ");
        }

        //연산식 설정 - 섭씨, 화씨 바꾸기
        System.out.print("\n섭씨 화씨 바꾸기 : ");
        test.getSumOfMultiple(a -> a*9/5 + 32);
    }
}
