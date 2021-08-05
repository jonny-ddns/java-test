package stream.pack02_스트림_파이프라인.ex07_기본집계;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        OptionalDouble optionalDouble = list.stream()
                                            .mapToInt(Integer :: intValue)
                                            .average();
        //값이 존재하는지 확인하고 대체값 설정
        if(optionalDouble.isPresent()){
            System.out.println(optionalDouble.getAsDouble());
        } else {
            System.out.println("avg1 : 0.0");
        }

        //값이 존재하는지 확인하고 대체값 설정
        double avg = list.stream()
                        .mapToInt(Integer :: intValue)
                        .average()
                        .orElse(0.0);
        System.out.println("avg2 : "+ avg);

        //값이 존재하는지 확인하고 있다면 값 출력하기
        list.stream()
            .mapToInt(Integer :: intValue)
            .average()
            .ifPresent(a -> System.out.println("avg3 : "+ a));
    }
}
