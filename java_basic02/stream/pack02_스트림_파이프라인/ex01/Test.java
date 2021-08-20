package java_basic02.stream.pack02_스트림_파이프라인.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("최나리", Member.FEMALE, 26),
                new Member("이태진", Member.FEMALE, 92),
                new Member("최성혁", Member.MALE, 59)
        );

        //f. 변수에 대입
        double averageAge =
                //a. 원본스트림 생성
                list.stream()

                        //b. 새로운 스트림 생성--> Male 과 일치하는 값으로 필터링
                        .filter(m -> m.getSex() == Member.MALE)

                        //c. 새로운 스트림 생성--> Member 와 age 매핑하기
                        .mapToInt(Member :: getAge)

                        //d. 평균값을 계산해서 OptionalDouble 객체에 저장
                        .average()

                        //e. 객체에 저장된 값 읽어들이기
                        .getAsDouble();

        System.out.println("남자 평균 나이 : "+ averageAge);


        /* 위 코드 한줄씩 실행해보기 */
        //필터링
        Stream stream1 = list.stream()
                .filter(m -> m.getSex() == Member.MALE);
        stream1.forEach( a -> System.out.println(a));

        //필터링 + 매핑
        IntStream stream2 = list.stream()
                .filter(m -> m.getSex() == Member.MALE)
                .mapToInt(Member::getAge);
        stream2.forEach(a -> System.out.println(a));

        //필터링 + 매핑 + 평균(OptionalDouble로 받기)
        OptionalDouble optionalDouble = list.stream()
                .filter(m -> m.getSex() == Member.MALE)
                .mapToInt(Member::getAge)
                .average();
        System.out.println(optionalDouble);

        //OptionalDouble에 있는 값 얻기
        Double value = optionalDouble.getAsDouble();
        System.out.println(value);
    }
}
