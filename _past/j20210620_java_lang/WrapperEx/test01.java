package _past.j20210620_java_lang.WrapperEx;

public class test01 {
    //boxing
    Integer integer01 = new Integer(123);
    Integer integer02 = 123;
    Integer integer03 = integer01;
    Integer integer04 = integer02;


    String str01 = "456";
    //Integer int03 = str01;        //오류 발생
    Integer integer11 = Integer.parseInt(str01);
    Integer integer12 = Integer.parseInt("789");


    //unboxing
    int int01 = integer01.intValue();
    int int02 = integer02.intValue();
    int int03 = integer03;
    int int04 = integer04;
}
