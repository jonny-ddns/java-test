package java_basic02.stream.pack02_스트림_파이프라인.ex03_매핑;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test03 {
    public static void main(String[] args) {
        int[] intArr = {16, 52, 49, 26, 83};
        IntStream intStream;

        System.out.println("--double 로 변환해서 출력하기");
        intStream = Arrays.stream(intArr);
        intStream.asDoubleStream()
                .forEach( a -> System.out.print(a+ " "));

        System.out.println("\n--boxing 된 값 출력하기");
        intStream = Arrays.stream(intArr);
        intStream.boxed()
                .forEach(a -> System.out.print(a+ " "));
    }
}
