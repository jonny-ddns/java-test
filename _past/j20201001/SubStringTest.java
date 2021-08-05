package _past.j20201001;

public class SubStringTest {
	public static void main(String[] args) {
		String str = "12345678";
		
		p(str.substring(0, 2));
		p(str.substring(1, 1));
		p(str.substring(1, 2));
		p(str.substring(4));
		p(str.substring(0, str.length()));
		p(str.substring(0, str.length()-1));
		p(str.substring(0, str.length()-2));
		p(str.substring(0, str.length()-3));
	}
	
	private static void p(String s) {
		System.out.println(s);
	}	
}
