package dataStructure_algorighm.pack11_sort.shellSort.ex01;

//�׷� ���Ұ� ���� ������ �˰��� ����
public class Test02 {
    public void sort(int[] a){
        int n = a.length;
        int i;      //�ݺ���1
        int j;      //�ݺ���2
        int tmp;    //�ӽ÷� ���� �޴� ����
        int h; //���Ұ�. ���������� 1/2 �� �����ϵ��� ������

        for(h=1; h<n/9; h=h*3+1)
            ;
        for(; h>0; h/=3){
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
