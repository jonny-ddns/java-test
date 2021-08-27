package dataStructure_algorighm.pack11_sort.insertionSort;

//삽입정렬
public class Test01 {
    public void test(){
        int[] intArr = {1, 14, 9, 6, 2, 19, 4, 7};
        int i, j, v;
        //
        for(i=2; i<intArr.length; i++){
            v = intArr[i];
            j = i;
            //
            while (intArr[j-1] > v) {
                intArr[j] = intArr[j-1];
                j--;
            }
            intArr[j] = v;
            System.out.println("반복문");
        }
    }
}
