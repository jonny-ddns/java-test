package java_basic01.j20201125;
public class PrintEx {

	static int k;

	public static void main(String[] args) {
		/*
		 * println, printf, print �޼ҵ� ���ϱ�
		 */
		k = 100000;
		long start;
		long end;
		long t1;
		long t2;
		long t3;
		
		PrintEx p = new PrintEx();
		
		start = System.currentTimeMillis();
		p.println();
		end = System.currentTimeMillis();	
		t1 = end-start;
		
		
		start = System.currentTimeMillis();
		p.printf();
		end = System.currentTimeMillis();
		t2 = end-start;
		
		start = System.currentTimeMillis();
		p.print();
		end = System.currentTimeMillis();
		t3 = end-start;
		
		System.out.println("�ð�1 : "+ t1);
		System.out.println("�ð�2 : "+ t2);
		System.out.println("�ð�3 : "+ t3);
		
//		System.out.println(t2/t1);
	}
	
	public void println() {		
		String s1 = "ö��";
		String s2 = "����";
		
		for(int i=0; i<PrintEx.k; i++) {
			System.out.println(s1+i+s2+i+s1+i+s2+i);
		}
	}
	
	public void printf() {		
		String s1 = "ö��";
		String s2 = "����";
		
		for(int i=0; i<PrintEx.k; i++) {
			System.out.printf("%s%d%s%d%s%d%s%d\n",s1, i, s2, i, s1, i, s2, i);
		}	
	}
	
	public void print() {		
		String s1 = "ö��";
		String s2 = "����";
		
		for(int i=0; i<PrintEx.k; i++) {
			System.out.print(s1+i+s2+i+s1+i+s2+i+"\n");
		}	
	}
}
