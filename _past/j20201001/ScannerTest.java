package _past.j20201001;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		System.out.println("--Scanner test--");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n문자열 입력 >>");
		String sentence = sc.nextLine();
		System.out.println(sentence);
		
		System.out.print("\n문자 입력 >>");
		String str1 = sc.next();
		System.out.println(str1);
		
		System.out.print("\n숫자입력 >>");
		int a = sc.nextInt();
		System.out.println(a);
		
		System.out.print("\n실수 입력 >>");
		double double1 = sc.nextDouble();
		System.out.println(double1);
		
		System.out.println("\n--Scanner close--");
		sc.close();
	}
}
