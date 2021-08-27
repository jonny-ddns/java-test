package dataStructure_algorighm.pack11_sort.selectionSort;

//선택정렬
public class Test01 {
    public void test(){
        int[] intArr = {1, 14, 9, 6, 2, 19, 4, 7};
        int i, j, min;

        for(i=0; i<intArr.length-1; i++){
            min = i;
            for(j=i+1; j<intArr.length; j++){
                if(intArr[j] <intArr[min]){
                    min = j;
                }
            }
            int temp = intArr[min];
            intArr[min] = intArr[i];
            intArr[i] = temp;
        }
    }
}
