package dataStructure_algorighm.pack11_sort.shellSort.ex01;

public class Execute {
    public static void main(String[] args) {
//        Test01 t = new Test01();
        Test02 t = new Test02();
        int[] intArr = {6, 2, 5, 3, 1, 7, 4, 8};
        t.sort(intArr);

        for (int i: intArr){
            System.out.print(i+ " ");
        }
    }
}
