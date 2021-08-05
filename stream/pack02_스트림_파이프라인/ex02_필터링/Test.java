package stream.pack02_��Ʈ��_����������.ex02_���͸�;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("���", "���", "����", "�ٳ���", "������", "����", "����", "�ٳ���", "����", "�丶��");

        System.out.println("--�ߺ�����");
        Stream<String> stream = list.stream().distinct();
        stream.forEach(a -> System.out.print(a+ " "));

        System.out.println("\n--�̸��� 3����");
        list.stream()
            .filter(fruit -> fruit.length() == 3)
            .forEach(a -> System.out.print(a+ " "));

        System.out.println("\n--�̸��� 3����, �ߺ�����");
        list.stream()
                .distinct()
                .filter(fruit -> fruit.length() == 3)
                .forEach(a -> System.out.print(a+ " "));

        System.out.println("\n--�̸��� 3����, �ߺ�����, ù���ڰ� '��'");
        list.stream()
                .distinct()
                .filter(fruit -> fruit.length() == 3)
                .filter(fruit -> fruit.startsWith("��"))
                .forEach(a -> System.out.print(a+ " "));
    }
}

