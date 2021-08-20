package java_basic02.thread.ex401_threadGroup.test01_group;

public class Execute {
    public static void main(String[] args) {
        ThreadGroup teamAlpha = new ThreadGroup("groupA");
        ThreadGroup teamDeci = new ThreadGroup("groupB");

        Employee empA = new Employee(teamAlpha, "홍길동");
        Employee empB = new Employee(teamAlpha, "이순신");
        Employee empC = new Employee(teamAlpha, "김유신");
        Employee emp1 = new Employee(teamDeci, "120");
        Employee emp2 = new Employee(teamDeci, "119");

        empA.start();
        empB.start();
        empC.start();
        emp1.start();
        emp2.start();

        ThreadGroup company = Thread.currentThread().getThreadGroup();
        
        //현재 스레드 그룹의 이름과 최대우선순위 정보를 출력하는 메서드
        company.list();

        String alphaName = teamAlpha.getName();
        String deciName = teamDeci.getName();
        System.out.println("--teamAlpha.getName : "+ alphaName);
        System.out.println("--teamDeci.getName : "+ deciName);

        ThreadGroup threadGroup = teamAlpha.getParent();
        System.out.println("--parentGroup : "+ threadGroup.getName());

        //SecurityException 예외가 발생하지 않는다 -> 그룹변경 권한이 있음
        teamAlpha.checkAccess();

        //스레드 그룹의 interrupt() 호출해 중지시키기
        teamAlpha.interrupt();
    }
}
