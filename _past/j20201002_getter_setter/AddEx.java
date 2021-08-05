package _past.j20201002_getter_setter;

public class AddEx {

	public static void main(String[] args) {
		
		Add a1 = new Add();
//		Add a2 = new Add(3);
//		Add a3 = new Add(2, 4);
		
		System.out.println("\n#toString Overriding 확인 : "+ a1.toString());
		System.out.println("#인스턴스 변수 확인  : "+ a1.a);
		System.out.println("#static 변수 확인 : "+ Add.INT);
		
		System.out.println("\n#GETTER & SETTER 연습");
		String getting = a1.getD();
		System.out.println(getting);
		System.out.println(a1.getD());
		
		a1.setD("HOW");
		System.out.println(a1.getD());	
	}
}
