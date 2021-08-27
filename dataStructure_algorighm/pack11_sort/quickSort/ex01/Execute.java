package dataStructure_algorighm.pack11_sort.quickSort.ex01;

import dataStructure_algorighm.pack11_sort.SortFunctions;

public class Execute {
    public static void main(String[] args) {
        new Test01();

        int count = 10;
        int[] a = new int[count];

        for(int i=0; i<count; i++){
//            System.out.println("??");
            a[i] = (int) (Math.random() * 20);
        }


        a = new Test01().sort(a, 0, a.length-1);
//        SortFunctions f = new SortFunctions();
//        f.printArr(a);
    }
}
