package dataStructure_algorighm.pack11_sort.insertionSort.ex01;

import dataStructure_algorighm.pack11_sort.SortFunctions;

//삽입정렬
public class Test01 {
    SortFunctions sortFunctions = new SortFunctions();
    int[] intArr = {2, 17, 8, 3, 15, 9, 4, 6, 13, 7, 1, 5, 11};

    public void test() {
        sort(intArr, intArr.length);
        sortFunctions.printArr(intArr);
    }

    private void sort(int[] a, int size){
        for(int i = 1; i < size; i++) {
            // 타겟 넘버
            int target = a[i];
            int j = i - 1;

            // 타겟이 이전 원소보다 크기 전 까지 반복
            while(j >= 0 && target < a[j]) {
                a[j + 1] = a[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
                j--;
            }

            /*
             * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
             * 타겟 원소는 j번째 원소 뒤에 와야한다.
             * 그러므로 타겟은 j + 1 에 위치하게 된다.
             */
            a[j + 1] = target;
            sortFunctions.printArr(intArr);
        }
    }
}
