package collectionFrameWork.pack02.Comparable_Comparator.ComparableEx;

public class Test {
    public static void main(String[] args) {
        Age_Comparable comparable = new Age_Comparable();

        int age1 = 12;
        int age2 = 24;
        String age3 = "20";

        int result01 = comparable.compareTo(age1);
        System.out.println(result01);

        int result02 = comparable.compareTo(age2);
        System.out.println(result02);

        int result03 = comparable.compareTo(age3);
        System.out.println(result03);

        /*
        ���� �Ͻ� �� �����ϴ�
        -1
        ȯ���մϴ�
        1
        ���̴� ���ڸ� �־��ּ���
        0
        */
    }
}
