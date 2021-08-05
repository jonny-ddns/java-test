package stream.pack01_스트림얻기.array;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] strArr = {"백지영", "박효신", "양파", "버즈"};
        //Arrays 클래스 - stream()메서드로 스트림 얻기
        Stream<String> strStream = Arrays.stream(strArr);
        //forEach는 반복하면서 모든 개별요소를 가져올 수 있다
        strStream.forEach( a -> {
            System.out.print(a+ " ");
        });
        System.out.println();

        int[] intArr = {12, 64, 92};
        //요소가 int 인 경우 IntStream으로 얻는다
        IntStream intStream = Arrays.stream(intArr);
        IntConsumer intConsumer = i -> System.out.print(i+ " ");
        intStream.forEach(intConsumer);
        System.out.println();

        double[] doubleArr = {145.46, 2.85};
        //요소가 double 인 경우 DoubleStream으로 얻는다
        DoubleStream doubleStream = Arrays.stream(doubleArr);
        doubleStream.forEach( a -> System.out.print(a+ " ") );
    }
}