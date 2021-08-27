package java_basic01.j20210325_staticBindingDynamicBinding.dynamicEx;

class Human { 
	//static 이 붙지 않아서 오버라이드 가능
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
        obj.walk();	//오버라이드 된 결과 출력
        obj2.walk();
    }
}