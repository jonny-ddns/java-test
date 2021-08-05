package stream.pack02_스트림_파이프라인.ex02_필터링;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("사과", "사과", "딸기", "바나나", "복숭아", "수박", "딸기", "바나나", "수박", "토마토");

        System.out.println("--중복제거");
        Stream<String> stream = list.stream().distinct();
        stream.forEach(a -> System.out.print(a+ " "));

        System.out.println("\n--이름이 3글자");
        list.stream()
            .filter(fruit -> fruit.length() == 3)
            .forEach(a -> System.out.print(a+ " "));

        System.out.println("\n--이름이 3글자, 중복제거");
        list.stream()
                .distinct()
                .filter(fruit -> fruit.length() == 3)
                .forEach(a -> System.out.print(a+ " "));

        System.out.println("\n--이름이 3글자, 중복제거, 첫글자가 '바'");
        list.stream()
                .distinct()
                .filter(fruit -> fruit.length() == 3)
                .filter(fruit -> fruit.startsWith("바"))
                .forEach(a -> System.out.print(a+ " "));
    }
}

