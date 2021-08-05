package finalEx;

public class Sparrow extends Bird{
    @Override
    void sing() {
        System.out.println("나는 꾀꼬리 같은 소리로 아침을 깨우지");
    }
    void fly(){
        //메서드를 선언할 수는 있지만 메서드 명이 동일할 뿐
        //Bird 클래스의 메서드를 오버라이드한 것은 아니다
        System.out.println("이 메서드는 출력 안된다");
    }

//    void wake(){} //오버라이드 불가
}
