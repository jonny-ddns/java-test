package _past.j20210128_main;

public class Main_test {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("값 개수가 부족합니다");
			System.exit(0);
		}
		
		String str_num1 = args[0];
		String str_num2 = args[1];
		
		//args[]로 주어진 String 값을 int값으로 변환
		int num1 = Integer.parseInt(str_num1);
		int num2 = Integer.parseInt(str_num2);
		
//		int result = num1 + num2;
		System.out.println("[실행결과] "+ num1+ "+"+ num2+ "="+ (num1+num2));
	}
}
/*
 * 그냥 실행하면 오류가 발생한다
 * 매개값을 지정하고 실행해야함
 * 
 * Run > Run Configuratios > Main 탭 > Project > Arguments 탭 
 * > program Arguments 칸에 원하는 값 2개 입력하기 > Apply
 */
