package _dataStructure_algorighm.pack11_sort.bubbleSort;

import _dataStructure_algorighm.pack11_sort.SortFunctions;

public class TestBubble02 {
    public void test(){

        SortFunctions s = new SortFunctions();
        int[] intArr = {1, 14, 9, 6, 2, 19, 4, 7};
        int i, j, temp;
        //a. 반복문1
        for(i=intArr.length-1; i>0; i--){
            //b. 반복문2
            for(j=0; j<i; j++){
                System.out.println("i , j :"+ i+ " "+ j);
                //c. 조건식
                if(intArr[j] > intArr[j+1]){
                    temp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = temp;

//                    s.printArr(intArr);
                }
            }
        }
    }
}
