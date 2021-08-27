package dataStructure_algorighm.pack11_sort.quickSort;

import dataStructure_algorighm.pack11_sort.SortFunctions;

public class Execute {
    public static void main(String[] args) {
        Test01 t = new Test01();
        int[] intArr = {1, 14, 9, 6, 2, 19, 4, 7};

        t.sort(intArr, 0, intArr.length-1);
        SortFunctions f = new SortFunctions();
        f.printArr(intArr);
    }
}
