package _past.j20201207;
import java.util.Arrays;
import java.util.Comparator;
/*
 * ���� �� compare ����
 */

public class CompareEx implements Comparator<Student>{
	//1 comparable ����
	Comparable<Student> c = null;
	
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getNumber() - o2.getNumber();
	}

	
	public static void intArr() {
		int[] arrInt = new int[] {1, 3, 12, 7, 5};
		Arrays.sort(arrInt);
		for(int i : arrInt) {
			System.out.print(i + " ");
		}
	}
}
