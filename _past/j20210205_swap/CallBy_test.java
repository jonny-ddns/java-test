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
		 * swap() 호출 시 사용된 인자값과
		 * swap() 메서드 내의 매개변수 x, y는 서로 다르다
		 * 
		 * Call by value는 메서드 호출 시에 사용되는 인자의 메모리에
		 * 저장되어 있는 값(value)을 복사하여 보낸다.
		 * 
		 */
		/*
		 * call by reference
		 * 변수 a, b는 각각 객체를 생성하여 지정된 메모리 번지에 저장된 56과 78의 주소값을 저장함
		 * swap() 메소드를 호출하면 인자 a와 b는 메모리에 저장 된 주소 값을 복사하여
		 * 매개변수 p와 q의 메모리에 저장합니다. 
		 * 
		 * swap() 메서드는 56과 78이 저장 된 각 번지의 주소를 참조하여 연산하기 때문에
		 * 연산 결과 원본 데이터가 바뀌게 됨
		 */
	}
}
