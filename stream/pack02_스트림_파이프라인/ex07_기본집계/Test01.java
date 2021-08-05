package stream.pack02_스트림_파이프라인.ex07_기본집계;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] intArr = {6, 1, 2, 5, 7, 3, 4, 8};

        long count = Arrays.stream(intArr)
                            .filter( a-> a%2 == 0)
                            .count();
        System.out.println("count : "+ count);

        long sum = Arrays.stream(intArr)
                            .filter( a-> a%2 == 0)
                            .sum();
        System.out.println("sum : "+ sum);

        double average = Arrays.stream(intArr)
                                .filter( a-> a%2 == 0)
                                .average()
                                .getAsDouble();
        System.out.println("average : "+ average);

        int max = Arrays.stream(intArr)
                        .filter( a-> a%2 == 0)
                        .max()
                        .getAsInt();
        System.out.println("max : "+ max);

        int min = Arrays.stream(intArr)
                        .filter( a-> a%2 == 0)
                        .min()
                        .getAsInt();
        System.out.println("min : "+ min);

        int first = Arrays.stream(intArr)
                            .filter( a-> a%2 == 0)
                            .findFirst()
                            .getAsInt();
        System.out.println("first : "+ first);
    }
}

