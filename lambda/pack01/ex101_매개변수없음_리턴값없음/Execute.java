package lambda.pack01.ex101_�Ű���������_���ϰ�����;

public class Execute {
    public static void main(String[] args) {
        //��ü ����
        JavaCoding jc;

        //{} �����ڵ� �ڿ� �����ݷ�(;)�� �ٿ����Ѵ�
        jc = () -> {
            System.out.println("Rollin' Rollin' Rollin' Rollin'");
        };
        jc.nowCoding();

        // {} �����ڵ尡 1���ΰ�� {} ��������
        jc = () -> System.out.println("Rollin' Rollin' Rollin' Rollin'");
        jc.nowCoding();
    }
}
