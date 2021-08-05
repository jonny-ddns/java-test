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
	 * 수학식으로 생각하면 된다
	 * x축과 y축으로 구성된 좌표라고 생각.
	 * (y=x 합집합 y=-x+10) 교집합 x<=5
	 * 위와 같다
	 * 이를 자바 코드로 표현하면 됨
	 */
	public static void print_3() {
		System.out.println("print_3");
		for(int y=0; y<11; y++) {
			for(int x=0; x<20; x++) {
				//수학적 계산식 삽입
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
