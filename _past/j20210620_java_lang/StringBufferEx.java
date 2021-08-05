package _past.j20210620_java_lang;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("he");
        printCapacityAndLength(sb); //capacity : 18 | length : 2

        sb.append("llo");
        printCapacityAndLength(sb); //capacity : 18 | length : 5

        sb.append("world");
        printCapacityAndLength(sb); //capacity : 18 | length : 10

        sb.append("iloveyou");
        printCapacityAndLength(sb); //capacity : 18 | length : 18

        sb.append("1234567890AB");
        printCapacityAndLength(sb); //capacity : 38 | length : 30

        sb.append("testTest");
        printCapacityAndLength(sb); //capacity : 38 | length : 38

        sb.append("!");
        printCapacityAndLength(sb); //capacity : 78 | length : 39

        sb.append("12345678901234567890123456789012345678901234567890");
        printCapacityAndLength(sb); //capacity : 158 | length : 89

        sb.delete(10, sb.length());
        printCapacityAndLength(sb); //capacity : 158 | length : 81

        System.out.println(sb.toString());  //helloworld

        sb.setLength(0);
        printCapacityAndLength(sb); //capacity : 158 | length : 0
        sb.trimToSize();
        printCapacityAndLength(sb); //capacity : 0 | length : 0
    }

    static void printCapacityAndLength(StringBuffer sb){
        System.out.println("capacity : "+ sb.capacity()+ " | length : "+ sb.length());
    }
}