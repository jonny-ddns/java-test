#싱글톤 패턴
 인스턴스가 남용되는 것은 바람직하지 않고 하나의 자원으로 모두가 공유해서 사용해야하는 경우
 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고 (=객체를 1번만 생성하여 재사용가능. 메모리 낭비 방지)
 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다
 주로 공통된 객체를 여러개 생성해서 사용하는 DBCP(DataBase Connection Pool)와 같은 상황에서 많이 사용된다
 (=전역성을 가지기 때문에 다른 객체와 공유가 용이함)
 
 
 아래는 기본적인 방법
    
public class Printer {

	//외부에서 접근할 수 있도록 클래스 변수 및 메소드를 static으로 선언하기
	private static Printer printer = null;
	
	//기본생성자를 private로 하여 외부에서 생성이 불가능하게 함
	private Printer(){}

	//대신 getInstance()메소드를 제공하여 생성된 객체를 리턴받게 함
	public static Printer getInstance() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
}



--------------------------------------------------
				여러가지 싱글톤 방식
--------------------------------------------------

-----------------------static block 방식
//static 블럭을 사용힐 경우 클래스가 로딩될 때 한번만 실행을 하게 되는 특성을 사용한다.
//하지만 인스턴스가 사용되는 시점이 아닌 클래스 로딩 시점에 실행이 된다
public class ExampleClass {
    //Instance 생성
    private static ExampleClass instance;

    //private construct
    private ExampleClass() {}

    static {
		//클래스 로딩시 생성
        try { instance = new ExampleClass();}
        catch(Exception e) { e.printStackTrace(); }
    }

    public static ExampleClass getInstance() {
        return instance;
    }
}



-----------------------lazy init 방식
//인스턴스가 필요하여 요청할 때 생성되는 방식
//멀티 스레드에 취약한 방식. 동시에 getInstance()를 호출할 경우 인스턴스가 2개 생성될 수 있음
public class ExampleClass {
    //Instance
    private static ExampleClass instance;

    //private construct
    private ExampleClass() {}

    public static ExampleClass getInstance() {
        if (instance == null) { instance = new ExampleClass();}
        return instance;
    }
}



-----------------------Thread safe + lazy 방식
//멀티 스레드에 대비하여 synchronized 를 도입
//성능 저하 발생
public class ExampleClass {
    //Instance
    private static ExampleClass instance;

    //private construct
    private ExampleClass() {}

    public static synchronized ExampleClass getInstance() {
        if (instance == null) { instance = new ExampleClass();}
        return instance;
    }
}






-----------------------Holder
//클래스 로더 메커니즘과 클래스의 로드 시점을 이용하여 내부 클래스를 통해 생성 시킴으로써 쓰레드 간의 동기화 문제를 해결
public class ExampleClass {

    private ExampleClass() {}
	
	//내부 클래스 생성.
    private static class InnerInstanceClazz() {
		private static final ExampleClass instance = new ExampleClass();
    }

    public static ExampleClass getInstance() {
        return InnerInstanceClazz.instance;
    }
}

--static final
static
final ; 불변하는값(변경불가) / 오버라이딩 불가 / 상속 불가

static final ; 객체가 아닌 클래스에 존재하는 단 한개의 상수.	
			    객체마다 바뀌는 값이 아닌 클래스에 존재하는 상수
			    때문에 선언과 동시에 초기화 필수임