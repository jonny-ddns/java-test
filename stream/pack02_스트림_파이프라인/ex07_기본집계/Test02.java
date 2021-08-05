package stream.pack02_��Ʈ��_����������.ex07_�⺻����;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        OptionalDouble optionalDouble = list.stream()
                                            .mapToInt(Integer :: intValue)
                                            .average();
        //���� �����ϴ��� Ȯ���ϰ� ��ü�� ����
        if(optionalDouble.isPresent()){
            System.out.println(optionalDouble.getAsDouble());
        } else {
            System.out.println("avg1 : 0.0");
        }

        //���� �����ϴ��� Ȯ���ϰ� ��ü�� ����
        double avg = list.stream()
                        .mapToInt(Integer :: intValue)
                        .average()
                        .orElse(0.0);
        System.out.println("avg2 : "+ avg);

        //���� �����ϴ��� Ȯ���ϰ� �ִٸ� �� ����ϱ�
        list.stream()
            .mapToInt(Integer :: intValue)
            .average()
            .ifPresent(a -> System.out.println("avg3 : "+ a));
    }
}
