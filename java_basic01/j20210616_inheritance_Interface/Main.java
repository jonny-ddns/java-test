package java_basic01.j20210616_inheritance_Interface;

public class Main {
	public static void main(String[] args) {
		Creature hong01 = new Creature();
		Creature hong02 = new Human();
		Creature hong03 = new Adult();

		System.out.println(hong01.toString());


		/*---------------------------------------*/
//		Creature ?κΊ½μ 01 = new Human();
//		Creature ?κΊ½μ 02 = new Human("?κΊ½μ 02", "?¨?±", 65);
//
//		Human ?κΊ½μ 11 = new Human("?κΊ½μ 11", "?¨?±", 59);
//		Human ?κΊ½μ 21 = new Adult();
//		?κΊ½μ 21.name = "?κΊ½μ 21";
//		?κΊ½μ 21.gender = "?¨?±";
//		?κΊ½μ 21.age = 35;
//
//		System.out.println(?κΊ½μ 01.toString());
//		System.out.println(?κΊ½μ 02.toString());
//		System.out.println(?κΊ½μ 11.toString());
//		System.out.println(?κΊ½μ 21.toString());
//
//		/*---------------------------------------*/
//		Adult κΉ??°?01 = new Adult("κΉ??°?01", "?¬?±", 25, "?Όκ²¨μ€μΌ??΄? ? ?", "??Έ?");
//		Adult κΉ??°?02 = new Adult("κΉ??°?02", "?¬?±", 25);
//		κΉ??°?02.job = "?Όκ²¨μ€μΌ??΄? ? ?";
//		κΉ??°?02.address = "??";
//		Adult κΉ??°?03 = new Adult("?Όκ΅? ? ?", "λΆ??°?");
//		κΉ??°?03.name = "κΉ??°?03";
//		κΉ??°?03.age = 17;
//		κΉ??°?03.gender = "?¨?±";
//		κΉ??°?03.address = "κΉ??΄?";
//
//		Worker ?΄??  = new Worker();
//		?΄?? .work();
	}
}
