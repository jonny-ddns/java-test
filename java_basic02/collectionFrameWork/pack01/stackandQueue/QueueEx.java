package java_basic02.collectionFrameWork.pack01.stackandQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue foods = new LinkedList();

        foods.add("�����");
        foods.add("�ᳪ������");
        foods.add("û����");
        foods.add("��ġ�");
        foods.add("�Ұ��");

        //���� �տ� �ִ� �� ��������
        //.element() �� ����Ÿ���� Object�̱� ������ �ٿ�ĳ���� ���ش�
        String foodFirst = (String) foods.element();
        System.out.println(foodFirst);

        String food01 = (String) foods.peek();
        String food02 = (String) foods.peek();
        String food03 = (String) foods.peek();

        //.peek() �� �������� �ʰ� ���� �տ� �ִ� ���� �����´�
        System.out.println(food01);
        System.out.println(food02);
        System.out.println(food03);

        //.poll()�� �����ϸ鼭 ���� �տ� �ִ� ���� �����´�
        String food11 = (String) foods.poll();
        String food12 = (String) foods.poll();
        String food13 = (String) foods.poll();
        String food14 = (String) foods.poll();
        String food15 = (String) foods.poll();

        System.out.println(food11);
        System.out.println(food12);
        System.out.println(food13);
        System.out.println(food14);
        System.out.println(food15);
    }
}
