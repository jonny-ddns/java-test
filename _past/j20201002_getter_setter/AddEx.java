package _past.j20201002_getter_setter;

public class AddEx {

	public static void main(String[] args) {
		
		Add a1 = new Add();
//		Add a2 = new Add(3);
//		Add a3 = new Add(2, 4);
		
		System.out.println("\n#toString Overriding Ȯ�� : "+ a1.toString());
		System.out.println("#�ν��Ͻ� ���� Ȯ��  : "+ a1.a);
		System.out.println("#static ���� Ȯ�� : "+ Add.INT);
		
		System.out.println("\n#GETTER & SETTER ����");
		String getting = a1.getD();
		System.out.println(getting);
		System.out.println(a1.getD());
		
		a1.setD("HOW");
		System.out.println(a1.getD());	
	}
}
