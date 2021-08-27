package java_basic01.j20210616_inheritance_Interface;

public class Adult extends Human{
	String job = null;
	String address = null;
	
	public Adult() {
	
	}	
	
	public Adult(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	public Adult(String job, String address) {
		super();
		this.job = job;
		this.address = address;
	}
	public Adult(String name, String gender, int age, String job, String address) {
		super(name, gender, age);
		this.job = job;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return super.toString()+ job+ " "+ address;
	}
}
