package java_basic01.j20210616_inheritance_Interface;

public class Main {
	public static void main(String[] args) {
		Creature hong01 = new Creature();
		Creature hong02 = new Human();
		Creature hong03 = new Adult();

		System.out.println(hong01.toString());


		/*---------------------------------------*/
//		Creature ?��꺽정01 = new Human();
//		Creature ?��꺽정02 = new Human("?��꺽정02", "?��?��", 65);
//
//		Human ?��꺽정11 = new Human("?��꺽정11", "?��?��", 59);
//		Human ?��꺽정21 = new Adult();
//		?��꺽정21.name = "?��꺽정21";
//		?��꺽정21.gender = "?��?��";
//		?��꺽정21.age = 35;
//
//		System.out.println(?��꺽정01.toString());
//		System.out.println(?��꺽정02.toString());
//		System.out.println(?��꺽정11.toString());
//		System.out.println(?��꺽정21.toString());
//
//		/*---------------------------------------*/
//		Adult �??��?��01 = new Adult("�??��?��01", "?��?��", 25, "?��겨스�??��?�� ?��?��", "?��?��?��");
//		Adult �??��?��02 = new Adult("�??��?��02", "?��?��", 25);
//		�??��?��02.job = "?��겨스�??��?�� ?��?��";
//		�??��?��02.address = "?��?��";
//		Adult �??��?��03 = new Adult("?���? ?��?��", "�??��?��");
//		�??��?��03.name = "�??��?��03";
//		�??��?��03.age = 17;
//		�??��?��03.gender = "?��?��";
//		�??��?��03.address = "�??��?��";
//
//		Worker ?��?��?�� = new Worker();
//		?��?��?��.work();
	}
}
