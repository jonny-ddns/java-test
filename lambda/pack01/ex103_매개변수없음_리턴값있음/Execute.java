package lambda.pack01.ex103_�Ű���������_���ϰ�����;

public class Execute {
    public static void main(String[] args) {
        //��ü ����
        JavaCoding jc;

        String str1 = "�� ���� ���� ���� baby";
        String str2 = "�� ���� ȯ�� ���� ���� �̼ҿ�";
        String str3 = "Ȧ�� �� I'm fall in love";

        jc = () -> {
            return str1;
        };
        System.out.println(jc.nowCoding());

        jc = () -> { return str2; };
        System.out.println(jc.nowCoding());

        //�����ڵ尡 return �� �ִ� ��� {}�� return�� ��������
        jc = () -> str3;
        System.out.println(jc.nowCoding());
    }
}
