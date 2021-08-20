package java_basic02.stream.pack02_��Ʈ��_����������.ex03_����;

import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {

        /*
        String ��Ҹ� ����������� ������ String ��ҷ� ������
        */
        List<String> listString = Arrays.asList(
               "ȫ �� ��", "�� �� ��"
        );
        listString.stream()
                .flatMap(a -> Arrays.stream(a.split(" ")))
                .forEach(a -> System.out.print(a+ " "));
        System.out.println();

        /*
        String ��� , �������� �и��ϱ�
        ������ int ���·� �ٲٱ�
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
