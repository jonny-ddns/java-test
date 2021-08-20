package java_basic02.stream.pack02_��Ʈ��_����������.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("ȫ�浿", Member.MALE, 30),
                new Member("�ֳ���", Member.FEMALE, 26),
                new Member("������", Member.FEMALE, 92),
                new Member("�ּ���", Member.MALE, 59)
        );

        //f. ������ ����
        double averageAge =
                //a. ������Ʈ�� ����
                list.stream()

                        //b. ���ο� ��Ʈ�� ����--> Male �� ��ġ�ϴ� ������ ���͸�
                        .filter(m -> m.getSex() == Member.MALE)

                        //c. ���ο� ��Ʈ�� ����--> Member �� age �����ϱ�
                        .mapToInt(Member :: getAge)

                        //d. ��հ��� ����ؼ� OptionalDouble ��ü�� ����
                        .average()

                        //e. ��ü�� ����� �� �о���̱�
                        .getAsDouble();

        System.out.println("���� ��� ���� : "+ averageAge);


        /* �� �ڵ� ���پ� �����غ��� */
        //���͸�
        Stream stream1 = list.stream()
                .filter(m -> m.getSex() == Member.MALE);
        stream1.forEach( a -> System.out.println(a));

        //���͸� + ����
        IntStream stream2 = list.stream()
                .filter(m -> m.getSex() == Member.MALE)
                .mapToInt(Member::getAge);
        stream2.forEach(a -> System.out.println(a));

        //���͸� + ���� + ���(OptionalDouble�� �ޱ�)
        OptionalDouble optionalDouble = list.stream()
                .filter(m -> m.getSex() == Member.MALE)
                .mapToInt(Member::getAge)
                .average();
        System.out.println(optionalDouble);

        //OptionalDouble�� �ִ� �� ���
        Double value = optionalDouble.getAsDouble();
        System.out.println(value);
    }
}
