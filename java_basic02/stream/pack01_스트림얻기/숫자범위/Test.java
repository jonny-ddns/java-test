package java_basic02.stream.pack01_��Ʈ�����.���ڹ���;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        //������ ���� ����
        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        intStream1.forEach( a -> System.out.print(a+ " "));
        System.out.println();

        //������ ���� ����
        IntStream intStream2 = IntStream.range(1, 10);
        intStream2.forEach( a -> System.out.print(a+ " "));
    }
}
