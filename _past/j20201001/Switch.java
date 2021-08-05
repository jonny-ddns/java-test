package _past.j20201001;

public class Switch {

	public static void main(String[] args) {
		
		int[] x = {1, 2, 3};
		for(int i=0; i<x.length; i++) {
			switch(x[i]) {
			case 1:
				System.out.println(x[i]+ ": せ");
				break;
			case 2:
				System.out.println(x[i]+ ": せせ");
				break;
			case 3:
				System.out.println(x[i]+ ": せせせ");
				break;
			}
		}
	}
}
