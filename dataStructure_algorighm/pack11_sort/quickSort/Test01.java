package dataStructure_algorighm.pack11_sort.quickSort;

public class Test01 {
    public void sort(int[] intArr, int low, int high){
        int pivot;

        //종료조건
        if(high>low){
            pivot = partition(intArr, low, high);
            sort(intArr, low, pivot-1);
            sort(intArr, pivot+1, high);
        }
    }

    int partition(int[] intArr, int low, int high){
        int left, right, pivot_item = intArr[low];
        left = low;
        right = high;

        while(left < right){
            while(intArr[left] <= pivot_item){
                left++;
            }
            while(intArr[right] > pivot_item){
                right--;
            }
            if(left<right){
                int tmp = intArr[left];
                intArr[left] = intArr[right];
                intArr[right] = tmp;
            }
        }

        intArr[low] = intArr[right];
        intArr[right] = pivot_item;
        return right;
    }

}
