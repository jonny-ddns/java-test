package lambda.pack01.ex102_�Ű���������_���ϰ�����;

public class Execute {
    public static void main(String[] args) {
        //��ü ����
        JavaCoding jc;
        String str;

        jc = (a) -> {
            System.out.println(a+ " Rolling in the deep");
        };
        str = "�Ϸ簡 �ִ��ϰ�";
        jc.nowCoding(str);

        //���ٽ� �ٵ�{}�� �����ϰ� �� �ٿ� �ۼ��ϱ�
        jc = (a) -> System.out.println(a+ " Babe just only you");
        str= "��ٸ��� ���ݾ�";
        jc.nowCoding(str);

        //�Ű������� 1���� ��� () ������ �� ����
        jc = a -> System.out.println(a+ " ��ٸ��� �־��");
        jc.nowCoding("������ �� �״� ������");
    }
}
