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

    //�Լ��� �������̽��� �޾� �ִ��� ���ϴ� �޼���
    int getMax(IntBinaryOperator operator){
        int result = numbers[0];
        //int[] �ݺ� ���鼭 ������ operator ������� -> ������ ����
        for(int number : numbers){
            result = operator.applyAsInt(result, number);
        }
        return result;
    }

    //�Լ��� �������̽��� �޾� �������� ���ϴ� �޼���
    int[] getSquare(IntUnaryOperator operator){
        int[] intArr = new int[numbers.length];

        for(int i = 0; i< numbers.length; i++){
            intArr[i] = operator.applyAsInt(numbers[i]);
        }
        return intArr;
    }

    //�Լ��� �������̽��� �޾� ������ ȭ���� �ٲٴ� �޼���
    void getSumOfMultiple(UnaryOperator<Double> operator){
        int sum = 0;
        for(double celcious : celciousArr){
            double fahrenheit = operator.apply(celcious);
            System.out.print(fahrenheit+ " ");
        }
    }

    public static void main(String[] args) {
        Test02 test = new Test02();

        //����� ���� - �ִ�
        int max = test.getMax(
            (a, b) -> {
                int number = a;
                if (a < b) number = b;
                return number;
            }
        );
        System.out.println("�ִ� : "+ max);

        //����� ���� - ������
        System.out.print("������ : ");
        int[] intArr = test.getSquare( a -> a*a );
        for(int d : intArr){
            System.out.print(d + " ");
        }

        //����� ���� - ����, ȭ�� �ٲٱ�
        System.out.print("\n���� ȭ�� �ٲٱ� : ");
        test.getSumOfMultiple(a -> a*9/5 + 32);
    }
}
