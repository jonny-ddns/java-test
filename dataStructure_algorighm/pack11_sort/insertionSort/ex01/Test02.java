package dataStructure_algorighm.pack11_sort.insertionSort.ex01;

import dataStructure_algorighm.pack11_sort.SortFunctions;

public class Test02 {
    private final SortFunctions sortFunctions = new SortFunctions();

    public void sort(int[] intArr){
        int i;      //�ܺ� �ݺ���. �ι�°���� n��°���� ������ �� ��������
        int j;      //���� �ݺ���. ���ĵ� ���� �ϳ��� �����ͼ� i�� ���� ����
        int value;  //���� ������
        for(i=1; i< intArr.length; i++){
//            System.out.println("i : "+ i);
            //�� �����ϱ�
            j = i-1;        //
            value = intArr[i];   //�ι�°���� n��°���� ���� ��� ����


            /*
            -�ڿ� �ִ� ���� ��� ��ĭ�� �о���� �ϱ� ������ while �� ���
            -�迭�� �տ������� �ڷ� �и� �ٷ� �ڿ� �ִ� ���� �浹�Ѵ�
              ������ �ڿ������� ��ĭ�� �о��ְ� �迭�� 0�̸��� ���� ������ �ʱ� ������
              (j>=0)������ �ִ´�
             */
            //���� �߰��� ���� �迭�� j��°���� �۴ٸ� ���� �迭�� ���� �ڷ� ��ĭ�� �б�
            while(j >= 0 && value < intArr[j]){
//                System.out.println("j : "+ j);
//                System.out.println("a[j] : "+ a[j]+ " | value : "+ value);
//                System.out.println("a[j] �� ĭ �б� ");

                intArr[j+1] = intArr[j];	//�迭�� ��ĭ�� �ڷ� �б�
//                System.out.println("j : "+ j);
                j--;    //�迭�� �� ĭ �տ� �ִ� ���� �ٽ� ���ϱ� ���� �ڵ�
            }
            
            //j+1��°�� ���ο� ���� �Ҵ��ϱ�
            intArr[j+1] = value;
//            sortFunctions.printArr(a);
//            System.out.println();
        }
    }


//    public void test2(){
//        int i;
//        int j;
//        int value;  //���� ������ ��
//        for(i=1; i< a.length; i++){
//            j = i-1;
//            value = a[i];
//
//            while(j>=0 && a[i] < a[j]){
//                System.out.println("a[i] : "+ a[i]+ " | value : "+ value);
//                a[j + 1] = a[j];	// ���� ���Ҹ� �� ĭ�� �ڷ� �̷��.
//                j--;
//            }
//            a[j + 1] = value;
//            sortFunctions.printArr(a);
//        }
//    }
}
