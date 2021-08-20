package _past.j20210128_ifElse;

public class StarPrint {
	
	public static void print_1() {
		System.out.println("print_1");
		for(int j=0; j<11; j++) {
			for(int i=0; i<20; i++) {
				if(j == i) System.out.print("*");
				System.out.print("o");
			}
			System.out.println();
		}		
	}
	
	public static void print_2() {
		System.out.println("print_2");
		for(int j=0; j<6; j++) {
			for(int i=0; i<20; i++) {
				if(j == i && i<6)
					System.out.print("*");
				System.out.print("o");
			}
			System.out.println();
		}		
		
		for(int j=0; j<6; j++) {
			for(int i=0; i<20; i++) {
				if(i+j == 5)
					System.out.print("*");
				System.out.print("o");
			}
			System.out.println();
		}
	}
	
	/*********************************/
	/*
	 * ���н����� �����ϸ� �ȴ�
	 * x��� y������ ������ ��ǥ��� ����.
	 * (y=x ������ y=-x+10) ������ x<=5
	 * ���� ����
	 * �̸� �ڹ� �ڵ�� ǥ���ϸ� ��
	 */
	public static void print_3() {
		System.out.println("print_3");
		for(int y=0; y<11; y++) {
			for(int x=0; x<20; x++) {
				//������ ���� ����
				if((y==x || y==-x+10) && x<=5)
					System.out.print("*");
				else
					System.out.print(" ");			
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		print_1();
		print_2();
		print_3();
	}	
}
