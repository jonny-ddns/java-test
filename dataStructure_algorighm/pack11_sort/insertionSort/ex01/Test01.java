package dataStructure_algorighm.pack11_sort.insertionSort.ex01;

import dataStructure_algorighm.pack11_sort.SortFunctions;

//��������
public class Test01 {
    SortFunctions sortFunctions = new SortFunctions();
    int[] intArr = {2, 17, 8, 3, 15, 9, 4, 6, 13, 7, 1, 5, 11};

    public void test() {
        sort(intArr, intArr.length);
        sortFunctions.printArr(intArr);
    }

    private void sort(int[] a, int size){
        for(int i = 1; i < size; i++) {
            // Ÿ�� �ѹ�
            int target = a[i];
            int j = i - 1;

            // Ÿ���� ���� ���Һ��� ũ�� �� ���� �ݺ�
            while(j >= 0 && target < a[j]) {
                a[j + 1] = a[j];	// ���� ���Ҹ� �� ĭ�� �ڷ� �̷��.
                j--;
            }

            /*
             * �� �ݺ������� Ż�� �ϴ� ��� ���� ���Ұ� Ÿ�ٺ��� �۴ٴ� �ǹ��̹Ƿ�
             * Ÿ�� ���Ҵ� j��° ���� �ڿ� �;��Ѵ�.
             * �׷��Ƿ� Ÿ���� j + 1 �� ��ġ�ϰ� �ȴ�.
             */
            a[j + 1] = target;
            sortFunctions.printArr(intArr);
        }
    }
}
