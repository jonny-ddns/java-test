package java_basic02.lambda.pack01.ex103_매개변수없음_리턴값있음;

public class Execute {
    public static void main(String[] args) {
        //객체 선언
        JavaCoding jc;

        String str1 = "그 날을 잊지 못해 baby";
        String str2 = "날 보며 환히 웃던 너의 미소에";
        String str3 = "홀린 듯 I'm fall in love";

        jc = () -> {
            return str1;
        };
        System.out.println(jc.nowCoding());

        jc = () -> { return str2; };
        System.out.println(jc.nowCoding());

        //실행코드가 return 만 있는 경우 {}와 return문 생략가능
        jc = () -> str3;
        System.out.println(jc.nowCoding());
    }
}
