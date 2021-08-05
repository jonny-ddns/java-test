package _past.j20201001;

public class IsNumeric {
	private static boolean isNumeric(Object ob){
		boolean isNumeric = false;
		String str = ob.toString();
		try{
			Integer.parseInt(str);
			System.out.println("111");
			return !isNumeric;
		} catch(Exception e){
			System.out.println("222");
			return isNumeric;	
		}
	}
	
	public static void main(String[] args) {
		boolean test1 = isNumeric(3);
		boolean test2 = isNumeric("34");
		System.out.println(test1);
		System.out.println(test2);
		
	}
}
