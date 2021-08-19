package _dataStructure_algorighm.pack11_sort.bubbleSort;

//버블정렬
public class TestBubble01 {
    public void test(){
        int[] intArr = {1, 14, 9, 6, 2, 19, 4, 7};
        //a. 반복문1 - 첫번째부터 n-1까지
        for(int i=0; i<intArr.length-1; i++){
            //b. 반복문2 - i+1부터 n까지
            for(int j=i+1; j<intArr.length; j++){
                //c. 조건식
                if(intArr[i] > intArr[j]){
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
    }
}
