package _past.j20201126;
//import java.util.Scanner;
public class Test {
	
	
	static void test(int n) {
		for (int i = 1; i <= n; i++) { 					// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1���� '*'�� ��Ÿ��
				System.out.print(i % 10);
			System.out.println(); 						// ����(�ٺ�ȯ)
		}
	}

	public static void main(String[] args) {
		
//		Scanner stdIn = new Scanner(System.in);
//		int n;
//
//		System.out.println("�Ƕ�̵� ������� ��Ÿ���ϴ�.");
//
//		do {
//			System.out.print("�ܼ��� ��");
//			n = stdIn.nextInt();
//		} while (n <= 0);
//
//		test(n); // �Ƕ�̵带 ��Ÿ��
//		stdIn.close();
		int i = 9;
		for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1���� '*'�� ��Ÿ��
			System.out.print(i % 3);
	}

}
