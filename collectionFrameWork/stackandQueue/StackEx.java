package collectionFrameWork.stackandQueue;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        //Stack�� ��ü �߰��ϱ�
        stack.push("������");
        stack.push("����");
        stack.push("�����");
        stack.push("�ϸ�");
        stack.push("�ڳ���");

        //.peek() -> �������� �ʰ� �ֻ���� �� ��������
        System.out.println(stack.peek());   //�ڳ���
        System.out.println(stack.peek());   //�ڳ���
        System.out.println(stack.peek());   //�ڳ���

        System.out.println(stack.pop());   //�ڳ���
        System.out.println(stack.pop());   //�ϸ�
        System.out.println(stack.pop());   //�����
        System.out.println(stack.pop());   //����
        System.out.println(stack.pop());   //������

        System.out.println(stack.empty());  //true

        //�ٽ� �� �߰�
        stack.push("�䳢");
        stack.push("����");
        stack.push("���̿���");
        stack.push("ġŸ");

        int count = stack.search("���̿���");
        System.out.println(count);  //2 -> ������ 2��° ��ġ���ִ�
    }
}
