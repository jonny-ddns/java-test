package java_basic01.j20210128_console;

public class Console_test {
	
	public static void main(String[] args) {
		System.out.write(65);
		System.out.write('B');
		System.out.write(13);	//����
				
		System.out.write(51);	//3
		System.out.write('3'+1);	
		System.out.write(10);	//����
		
		//���� �߻�. ���ڿ��� �ƴ� ���ڸ� ���� �� �ִ�
//		System.out.write("hello");
//		System.out.write('hello');
		
		System.out.write('h');
		System.out.write('e');
		System.out.write('l');
		System.out.write('l');
		System.out.write('o');
		
		/*
		 * System.out.println()
		 * ���� : �Ѱܹ��� ���ڿ� ����� ����
		 * write() ������ ȣ�� �� �������� flush()�� ȣ���� 
		 */
				
		//flush()�� ���� ���۸� ������ ����� ������
		System.out.flush();
	}
}
