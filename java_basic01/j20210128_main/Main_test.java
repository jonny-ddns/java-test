package _past.j20210128_main;

public class Main_test {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("�� ������ �����մϴ�");
			System.exit(0);
		}
		
		String str_num1 = args[0];
		String str_num2 = args[1];
		
		//args[]�� �־��� String ���� int������ ��ȯ
		int num1 = Integer.parseInt(str_num1);
		int num2 = Integer.parseInt(str_num2);
		
//		int result = num1 + num2;
		System.out.println("[������] "+ num1+ "+"+ num2+ "="+ (num1+num2));
	}
}
/*
 * �׳� �����ϸ� ������ �߻��Ѵ�
 * �Ű����� �����ϰ� �����ؾ���
 * 
 * Run > Run Configuratios > Main �� > Project > Arguments �� 
 * > program Arguments ĭ�� ���ϴ� �� 2�� �Է��ϱ� > Apply
 */
