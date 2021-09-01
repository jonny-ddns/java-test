package dataStructure_algorighm.pack11_sort.quickSort.ex01;

public class Execute {
    public static void main(String[] args) {
        Test01 t = new Test01();
        int[] intArr = {2, 17, 8, 3, 15, 9, 4, 6, 13, 7, 1, 5, 11};
        t.partition(intArr, 0, intArr.length-1);
        for(int i: intArr){
            System.out.print(i+ " ");
        }
    }
}
