package _past.j20201207;
public class Main {
	public static void main(String[] args) {
		CompareEx com = new CompareEx();
		Student s1 = new Student("ȫ", 12, 23);
		Student s2 = new Student("��", 9, 29);
		System.out.println(com.compare(s1, s2));
		System.out.println(s1.compareTo(s2));
		CompareEx.intArr();
	}
}
