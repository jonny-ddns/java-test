package stream.pack01_��Ʈ�����.array;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] strArr = {"������", "��ȿ��", "����", "����"};
        //Arrays Ŭ���� - stream()�޼���� ��Ʈ�� ���
        Stream<String> strStream = Arrays.stream(strArr);
        //forEach�� �ݺ��ϸ鼭 ��� ������Ҹ� ������ �� �ִ�
        strStream.forEach( a -> {
            System.out.print(a+ " ");
        });
        System.out.println();

        int[] intArr = {12, 64, 92};
        //��Ұ� int �� ��� IntStream���� ��´�
        IntStream intStream = Arrays.stream(intArr);
        IntConsumer intConsumer = i -> System.out.print(i+ " ");
        intStream.forEach(intConsumer);
        System.out.println();

        double[] doubleArr = {145.46, 2.85};
        //��Ұ� double �� ��� DoubleStream���� ��´�
        DoubleStream doubleStream = Arrays.stream(doubleArr);
        doubleStream.forEach( a -> System.out.print(a+ " ") );
    }
}