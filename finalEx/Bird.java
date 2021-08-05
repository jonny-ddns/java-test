package finalEx;

public class Bird {
    final int footCount = 2;
    
    void sing(){
        System.out.println("노래 부른다");
    }
    
    final void fiy(){
        System.out.println("하늘 난다");
    }
    static final void wake(){
        System.out.println("일찍 일어나는 새가 벌레를 잡는다");
    }
}
