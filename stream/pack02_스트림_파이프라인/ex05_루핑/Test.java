package stream.pack02_��Ʈ��_����������.ex05_����;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] intArr = {6, 1, 2, 5, 7, 3, 4, 8};

        System.out.println("--peek ȣ��(��Ʈ�� ���۾���)");
        Arrays.stream(intArr)
             .filter( a-> a%2 == 0)         //¦�� ���͸�
             .peek( a -> System.out.print(a+ " "));

        System.out.println("--peek ȣ�� + �����޼��� ȣ��");
        int total = Arrays.stream(intArr)
                        .filter( a-> a%2 == 0)
                        .peek( a -> System.out.print(a+ " "))
                        .sum();
        System.out.println("\ntotal : "+ total);

        System.out.println("--forEach ȣ��");
        Arrays.stream(intArr)
                .filter( a-> a%2 == 0)
                .forEach(a -> System.out.print(a+ " "));

        System.out.println("\n--forEach + �޼��� ȣ��(�����Ͽ���)");
//        Arrays.stream(intArr)
//                .filter( a-> a%2 == 0)
//                .forEach(a -> System.out.println(a))
//                .count();
    }
}
