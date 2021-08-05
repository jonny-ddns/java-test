package _past.j20210620_java_lang.WrapperEx;

public class test02 {
    //boxing example
    String strFalse = "false";
    String strTrrr = "trrr";
    Boolean boolean01 = new Boolean("true");
    Boolean boolean02 = new Boolean(strFalse);
    Boolean boolean03 = boolean01;
    //Boolean boolean04 = new Boolean(strTrrr);   //오류 발생


    //unboxing example
    boolean bool01 = boolean01.booleanValue();
    boolean bool02 = boolean02;
    boolean bool03 = bool01;
}
