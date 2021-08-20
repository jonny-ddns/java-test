package java_basic02.stream.pack02_스트림_파이프라인.ex03_매핑;

import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {

        /*
        String 요소를 공백기준으로 각각의 String 요소로 나누기
        */
        List<String> listString = Arrays.asList(
               "홍 길 동", "임 꺽 정"
        );
        listString.stream()
                .flatMap(a -> Arrays.stream(a.split(" ")))
                .forEach(a -> System.out.print(a+ " "));
        System.out.println();

        /*
        String 요소 , 기준으로 분리하기
        각각을 int 형태로 바꾸기
        */
        List<String> listInt = Arrays.asList(
            "17, 32, 71, 96, 26, 53"
        );
        listInt.stream()
                .flatMapToInt(data -> {
                   String[] strArr = data.split(",");
                   int[] intArr = new int[strArr.length];
                   for(int i=0; i<strArr.length; i++){
                       intArr[i] = Integer.parseInt(strArr[i].trim());
                   }
                   return Arrays.stream(intArr);
                })
                .forEach(a -> System.out.print(a+ " "));
    }
}
