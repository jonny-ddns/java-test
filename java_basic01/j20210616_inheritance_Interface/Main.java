package java_basic01.j20210616_inheritance_Interface;

public class Main {
	public static void main(String[] args) {
		Creature hong01 = new Creature();
		Creature hong02 = new Human();
		Creature hong03 = new Adult();

		System.out.println(hong01.toString());


		/*---------------------------------------*/
//		Creature ?„êº½ì •01 = new Human();
//		Creature ?„êº½ì •02 = new Human("?„êº½ì •02", "?‚¨?„±", 65);
//
//		Human ?„êº½ì •11 = new Human("?„êº½ì •11", "?‚¨?„±", 59);
//		Human ?„êº½ì •21 = new Adult();
//		?„êº½ì •21.name = "?„êº½ì •21";
//		?„êº½ì •21.gender = "?‚¨?„±";
//		?„êº½ì •21.age = 35;
//
//		System.out.println(?„êº½ì •01.toString());
//		System.out.println(?„êº½ì •02.toString());
//		System.out.println(?„êº½ì •11.toString());
//		System.out.println(?„êº½ì •21.toString());
//
//		/*---------------------------------------*/
//		Adult ê¹??—°?•„01 = new Adult("ê¹??—°?•„01", "?—¬?„±", 25, "?”¼ê²¨ìŠ¤ì¼??´?Œ… ?„ ?ˆ˜", "?„œ?š¸?‹œ");
//		Adult ê¹??—°?•„02 = new Adult("ê¹??—°?•„02", "?—¬?„±", 25);
//		ê¹??—°?•„02.job = "?”¼ê²¨ìŠ¤ì¼??´?Œ… ?„ ?ˆ˜";
//		ê¹??—°?•„02.address = "?…?„";
//		Adult ê¹??—°?•„03 = new Adult("?•¼êµ? ?„ ?ˆ˜", "ë¶??‚°?‹œ");
//		ê¹??—°?•„03.name = "ê¹??—°?•„03";
//		ê¹??—°?•„03.age = 17;
//		ê¹??—°?•„03.gender = "?‚¨?„±";
//		ê¹??—°?•„03.address = "ê¹??•´?‹œ";
//
//		Worker ?´?ˆœ?‹  = new Worker();
//		?´?ˆœ?‹ .work();
	}
}
