package _dataStructure_algorighm.pack01_temp;
public class Sum35_2 {
	public static void method(int a, int b){
		int t = 0;
		int number = 1000;
		for(int i=1; i<number; i++) {
			if(i%a==0 || i%b==0)
				t += i;
		}
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		method(3, 5);
	}
}