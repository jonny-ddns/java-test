package dataStructure_algorighm.pack11_sort.quickSort.ex01;

public class Test01 {
    public int[] sort(int A[], int low, int high){
        int pivot;

        //종료조건
        if(high>low){
            pivot = partition(A, low, high);
            sort(A, low, pivot-1);
            sort(A, pivot+1, high);
        }
        return A;
    }

    int partition(int[] A, int low, int high){
        int left, right, pivot_item = A[low];
        left = low;
        right = high;

        while(left < right){
            while(A[left] <= pivot_item){
                left++;
            }
            while(A[right] > pivot_item){
                right--;
            }
            if(left < right){
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }
        }

        A[low] = A[right];
        A[right] = pivot_item;
        return right;
    }

}
