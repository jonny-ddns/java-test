package java_basic02.lambda.pack01.ex104_�Ű���������_���ϰ�����;

public class Execute {
    public static void main(String[] args) {
        //��ü ����
        JavaCoding jc;

        String str1 = " ���� �������̾�";
        String str2 = " ��ġ�ھ�";
        String str3 = " ���� �;�";

        jc = (s) -> {
            return s+ str1;
        };
        System.out.println(jc.nowCoding("����"));

        jc = (s) -> { return s+ str2; };
        System.out.println(jc.nowCoding("����"));

        jc = s -> s+ str3;
        System.out.println(jc.nowCoding("�ʹ�"));
    }
}
