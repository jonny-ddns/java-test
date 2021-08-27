package java_basic01.j20201207;
public class Student implements Comparable<Student>{

	private String name;
	private int number;
	private int age;
	
	public Student(String name, int number, int age) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}	
	
	@Override
	public int compareTo(Student o) {
		int result = this.getName().compareTo(o.getName());
		if(result != 0) {
			result = this.getAge() - o.getAge();
		}
		return result;
	}
}
