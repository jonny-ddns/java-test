package java_basic02.finalEx;

public class Sparrow extends Bird{
    @Override
    void sing() {
        System.out.println("���� �Ҳ��� ���� �Ҹ��� ��ħ�� ������");
    }
    void fly(){
        //�޼��带 ������ ���� ������ �޼��� ���� ������ ��
        //Bird Ŭ������ �޼��带 �������̵��� ���� �ƴϴ�
        System.out.println("�� �޼���� ��� �ȵȴ�");
    }

//    void wake(){} //�������̵� �Ұ�
}
