package dataStructure_algorighm.pack01_temp;

public class Sum35 {
	/*
	 * 1000미만의 숫자 중에서 3의 배수와 5의 배수 총합
	 * https://wikidocs.net/237
	 */
	
	public static void main(String[] args) {		
		
		int number = 1000;
		
		int mok3 = number/3;
		int mok5 = number/5;
		int mok15 = number/15;
				
//		System.out.println(mokA);
//		System.out.println(mokB);
		
		int sum3 = 0;
		int sum5 = 0;
		int sum15 = 0;
		
		//3의 배수 합
		for(int i=1; i<=mok3; i++) {
			int n = i*3;
			sum3 += n;
		}
	
		for(int i=1; i<mok5; i++) {
			int n = i*5;
			sum5 += n;
		}
		
		for(int i=1; i<=mok15; i++) {
			int n = i*15;
			sum15 += n;
		}
				
//		System.out.println(sum3);
//		System.out.println(sum5);
//		System.out.println(sum15);
		
		System.out.println("총합 : "+ (sum3+sum5-sum15));
	}
}
