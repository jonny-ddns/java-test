package _past.j20210325_staticBindingDynamicBinding.staticEx;
class Human {
	//static 이라고 명시. 
    public static void walk() {
        System.out.println("Human walks");
    }
}
class Boy extends Human {
    public static void walk() {
        System.out.println("Boy walks");
    }
    public static void main(String args[]) { /* Reference is of Human type and object is
        * Boy type
        */
        Human obj1 = new Boy();
        /* Reference is of HUman type and object is
        * of Human type.
        */
        Human obj2 = new Human();
//        Boy.walk();
//        Human.walk();
        obj1.walk();	//오버라이드 불가. static메소드 결과 출력
        obj2.walk();
       
    }
}