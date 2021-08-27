package java_basic01.j20210128_console;

public class Console_test {
	
	public static void main(String[] args) {
		System.out.write(65);
		System.out.write('B');
		System.out.write(13);	//개행
				
		System.out.write(51);	//3
		System.out.write('3'+1);	
		System.out.write(10);	//개행
		
		//오류 발생. 문자열이 아닌 문자만 받을 수 있다
//		System.out.write("hello");
//		System.out.write('hello');
		
		System.out.write('h');
		System.out.write('e');
		System.out.write('l');
		System.out.write('l');
		System.out.write('o');
		
		/*
		 * System.out.println()
		 * 역할 : 넘겨받은 문자열 출력을 위해
		 * write() 여러번 호출 뒤 마지막에 flush()를 호출함 
		 */
				
		//flush()를 통해 버퍼를 비워줘야 출력이 가능함
		System.out.flush();
	}
}
