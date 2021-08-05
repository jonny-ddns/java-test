package stream.pack02_스트림_파이프라인.ex05_루핑;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] intArr = {6, 1, 2, 5, 7, 3, 4, 8};

        System.out.println("--peek 호출(스트림 동작안함)");
        Arrays.stream(intArr)
             .filter( a-> a%2 == 0)         //짝수 필터링
             .peek( a -> System.out.print(a+ " "));

        System.out.println("--peek 호출 + 최종메서드 호출");
        int total = Arrays.stream(intArr)
                        .filter( a-> a%2 == 0)
                        .peek( a -> System.out.print(a+ " "))
                        .sum();
        System.out.println("\ntotal : "+ total);

        System.out.println("--forEach 호출");
        Arrays.stream(intArr)
                .filter( a-> a%2 == 0)
                .forEach(a -> System.out.print(a+ " "));

        System.out.println("\n--forEach + 메서드 호출(컴파일에러)");
//        Arrays.stream(intArr)
//                .filter( a-> a%2 == 0)
//                .forEach(a -> System.out.println(a))
//                .count();
    }
}
