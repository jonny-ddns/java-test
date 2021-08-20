package java_basic02.lambda.pack01.ex104_매개변수있음_리턴값있음;

public class Execute {
    public static void main(String[] args) {
        //객체 선언
        JavaCoding jc;

        String str1 = " 너의 생각뿐이야";
        String str2 = " 미치겠어";
        String str3 = " 보고 싶어";

        jc = (s) -> {
            return s+ str1;
        };
        System.out.println(jc.nowCoding("온통"));

        jc = (s) -> { return s+ str2; };
        System.out.println(jc.nowCoding("나도"));

        jc = s -> s+ str3;
        System.out.println(jc.nowCoding("너무"));
    }
}
