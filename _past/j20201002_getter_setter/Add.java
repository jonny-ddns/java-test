package _past.j20201002_getter_setter;

public class Add {
	
	int a = 10;
	int b = 45;
	static int INT = 70;
	private String d = "WHAT";
	
	public Add() {
		System.out.println("test1");
	}
	public Add(int x) {
		System.out.println("test2");
	}
	public Add(int x, int y) {
		System.out.println("test3");
	}
	
	@Override
	public String toString() {
		return "test 입니다";
	}
	
	//getter 연습
		//메서드이다 -> ()
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	
}