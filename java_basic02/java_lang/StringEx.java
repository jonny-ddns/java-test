package java_basic02.java_lang;

public class StringEx {
    public static void main(String[] args) {
        String str01 = new String("hello world");
        String str02 = new String("hello world");
        String str03 = "hello world";
        String str04 = "hello world";
        String str05 = new String("HELLO WORLD");
        String str06 = str05.toLowerCase();

        System.out.println(str01.equals(str02));    //true
        System.out.println(str02.equals(str03));    //true
        System.out.println(str03.equals(str04));    //true
        System.out.println(str04.equals(str06));    //true
        System.out.println(str01 == str02);         //false
        System.out.println(str02 == str03);         //false
        System.out.println(str01 == str03);         //false
        System.out.println(str03 == str04);         //true

//        str01.hashCode();
//
//        System.out.println(str01.hashCode());   //1794106052
//        System.out.println(str02.hashCode());   //1794106052
//        System.out.println(str03.hashCode());   //1794106052
//        System.out.println(str04.hashCode());   //1794106052
//        System.out.println(str05.hashCode());   //568227000
//        System.out.println(str06.hashCode());   //1794100472
//
//        System.out.println(str04);
//        System.out.println(str06);
    }
}



