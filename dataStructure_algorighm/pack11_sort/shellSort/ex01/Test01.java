package dataStructure_algorighm.pack11_sort.shellSort.ex01;

public class Test01 {
    public void sort(int[] a){
        int n = a.length;
        int i;      //�ݺ���1
        int j;      //�ݺ���2
        int tmp;    //�ӽ÷� ���� �޴� ����
        int h; //���Ұ�. ���������� 1/2 �� �����ϵ��� ������
        for(h=n/2; h>0; h/=2){
            for (i=h; i<n; i++) {
                tmp = a[i];
                for (j = i-h; j >= 0 && a[j] > tmp; j-=h) {
                    a[j + h] = a[j];
                }
                a[j + h] = tmp;
            }
        }
    }
}
