package _past.j20201126;
import java.util.Random;
public class RandomTest {
	public static void main(String[] args) {
		
		Random rand = new Random();
//		int a;
		int n = 5;
		for(int i=0; i<n; i++) System.out.print(rand.nextInt(20)+ " ");
		System.out.println();
		for(int i=0; i<n; i++) System.out.print(rand.nextDouble()+ " ");
		System.out.println();
		for(int i=0; i<n; i++) System.out.print(rand.nextBoolean()+ " ");
		System.out.println();
		for(int i=0; i<n; i++) System.out.print(rand.nextLong()+ " ");
	}
}
