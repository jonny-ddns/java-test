package _past.j20210208_delegation;

public class Main {
	//위임delegation 학습
	/*
	 * 위임의 경우 2개 이상의 클래스를 상속(다중 상속)할 필요가 있는경우
	 * 자바는 다중상속을 금하기 때문에 둘 이상의 상속이 필요한 경우 위임하는 방식을 택함
	 */
	public static void main(String[] args) {		
		Manager manager = new Manager();
		manager.echo();
	}
}
