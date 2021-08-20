package java_basic02.stream.pack02_��Ʈ��_����������.ex03_����;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test03 {
    public static void main(String[] args) {
        int[] intArr = {16, 52, 49, 26, 83};
        IntStream intStream;

        System.out.println("--double �� ��ȯ�ؼ� ����ϱ�");
        intStream = Arrays.stream(intArr);
        intStream.asDoubleStream()
                .forEach( a -> System.out.print(a+ " "));

        System.out.println("\n--boxing �� �� ����ϱ�");
        intStream = Arrays.stream(intArr);
        intStream.boxed()
                .forEach(a -> System.out.print(a+ " "));
    }
}
