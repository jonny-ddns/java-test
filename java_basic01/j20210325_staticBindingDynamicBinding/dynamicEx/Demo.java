package java_basic01.j20210325_staticBindingDynamicBinding.dynamicEx;

class Human { 
	//static �� ���� �ʾƼ� �������̵� ����
    public void walk() {
        System.out.println("Human walks");
    }
}
class Demo extends Human {
    @Override
    public void walk() {
        System.out.println("Boy walks");
    }
    public static void main(String[] args) {
        Human obj = new Demo();
        Human obj2 = new Human();
        obj.walk();	//�������̵� �� ��� ���
        obj2.walk();
    }
}