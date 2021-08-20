package java_basic02.generic.numberCompare;

public class Test {
    public static void main(String[] args) {
        numberCompare nc = new numberCompare();

        int result01 = nc.compare(10, 20);
        System.out.println(result01);

        int result02 = nc.compare(5.41, 3.6);
        System.out.println(result02);

        int result03 = nc.compare(3, 3);
        System.out.println(result03);
    }
}
