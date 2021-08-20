package _past.j20210205_swap;

public class CallBy_test {
	/*
	 * call by value 
	 * call by reference
	 */
	
	static class CallByValue{
		public void swap_v(int x, int y) {
			int temp = x;
			x = y;
			y = temp;
		}
	}
	
	static class CallByReference {
		int value;
		
		public CallByReference(int value) {
			this.value = value;
		}		
		
		public void swap_r(CallByReference x, CallByReference y) {
			int temp = x.value;
			x.value = y.value;
			y.value = temp;
		}
	}
	
	public static void main(String[] args) {

		CallByValue cv = new CallByValue();
		CallByReference p = new CallByReference(56);
		CallByReference q = new CallByReference(78);	
		
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		cv.swap_v(12, 34);		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		/**********************/
		System.out.println(p.value);
		System.out.println(q.value);
		p.swap_r(p, q);		
		System.out.println(p.value);
		System.out.println(q.value);
		q.swap_r(p, q);
		System.out.println(p.value);
		System.out.println(q.value);
		
		/*
		 * call by value
		 * swap() ȣ�� �� ���� ���ڰ���
		 * swap() �޼��� ���� �Ű����� x, y�� ���� �ٸ���
		 * 
		 * Call by value�� �޼��� ȣ�� �ÿ� ���Ǵ� ������ �޸𸮿�
		 * ����Ǿ� �ִ� ��(value)�� �����Ͽ� ������.
		 * 
		 */
		/*
		 * call by reference
		 * ���� a, b�� ���� ��ü�� �����Ͽ� ������ �޸� ������ ����� 56�� 78�� �ּҰ��� ������
		 * swap() �޼ҵ带 ȣ���ϸ� ���� a�� b�� �޸𸮿� ���� �� �ּ� ���� �����Ͽ�
		 * �Ű����� p�� q�� �޸𸮿� �����մϴ�. 
		 * 
		 * swap() �޼���� 56�� 78�� ���� �� �� ������ �ּҸ� �����Ͽ� �����ϱ� ������
		 * ���� ��� ���� �����Ͱ� �ٲ�� ��
		 */
	}
}
