package _dataStructure_algorighm.pack11_sort.bubbleSort;

//��������
public class TestBubble01 {
    public void test(){
        int[] intArr = {1, 14, 9, 6, 2, 19, 4, 7};
        //a. �ݺ���1 - ù��°���� n-1����
        for(int i=0; i<intArr.length-1; i++){
            //b. �ݺ���2 - i+1���� n����
            for(int j=i+1; j<intArr.length; j++){
                //c. ���ǽ�
                if(intArr[i] > intArr[j]){
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
    }
}
