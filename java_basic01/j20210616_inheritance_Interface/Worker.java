package java_basic01.j20210616_inheritance_Interface;

public class Worker extends Adult implements Work{
	
	@Override
	public void work() {
		System.out.println("work ÇÕ´Ï´Ù");
	}
}
