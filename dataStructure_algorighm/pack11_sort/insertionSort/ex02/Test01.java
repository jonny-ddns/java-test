package dataStructure_algorighm.pack11_sort.insertionSort.ex02;

import java.util.Arrays;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        int[] intArr = {2, 17, 8, 3, 15, 9, 4, 6, 13, 7, 1, 5, 11};
        Iterator<Integer> iterator = Arrays.stream(new Test01().sort(intArr)).iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
    }

    public int[] sort(int[] intArr){
        int i;
        int j;
        int value;
        for(i=1; i< intArr.length; i++){
            j = i-1;
            value = intArr[i];

            while(j >= 0 && value > intArr[j]){
                intArr[j+1] = intArr[j];
                j--;
            }
            intArr[j+1] = value;
        }
        return intArr;
    }
}
