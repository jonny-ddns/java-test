package java_basic02.thread.ex401_threadGroup.test01_group;

public class Execute {
    public static void main(String[] args) {
        ThreadGroup teamAlpha = new ThreadGroup("groupA");
        ThreadGroup teamDeci = new ThreadGroup("groupB");

        Employee empA = new Employee(teamAlpha, "ȫ�浿");
        Employee empB = new Employee(teamAlpha, "�̼���");
        Employee empC = new Employee(teamAlpha, "������");
        Employee emp1 = new Employee(teamDeci, "120");
        Employee emp2 = new Employee(teamDeci, "119");

        empA.start();
        empB.start();
        empC.start();
        emp1.start();
        emp2.start();

        ThreadGroup company = Thread.currentThread().getThreadGroup();
        
        //���� ������ �׷��� �̸��� �ִ�켱���� ������ ����ϴ� �޼���
        company.list();

        String alphaName = teamAlpha.getName();
        String deciName = teamDeci.getName();
        System.out.println("--teamAlpha.getName : "+ alphaName);
        System.out.println("--teamDeci.getName : "+ deciName);

        ThreadGroup threadGroup = teamAlpha.getParent();
        System.out.println("--parentGroup : "+ threadGroup.getName());

        //SecurityException ���ܰ� �߻����� �ʴ´� -> �׷캯�� ������ ����
        teamAlpha.checkAccess();

        //������ �׷��� interrupt() ȣ���� ������Ű��
        teamAlpha.interrupt();
    }
}
