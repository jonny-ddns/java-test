package collectionFrameWork.pack02.Comparable_Comparator.ComparatorEx;

public class Test {
    public static void main(String[] args) {
        ComparatorEx comp = new ComparatorEx();

        int result01 = comp.compare(4, 6);
        int result02 = comp.compare(3, 6);
        int result03 = comp.compare("scannerTest", 6);

        System.out.println(result01);   //0
        System.out.println(result02);   //1
        System.out.println(result03);   //-1
    }
}
