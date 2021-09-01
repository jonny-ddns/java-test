package dataStructure_algorighm.pack11_sort.shellSort.ex01;

public class Test01 {
    public void sort(int[] a){
        int n = a.length;
        int i;      //반복자1
        int j;      //반복자2
        int tmp;    //임시로 값을 받는 변수
        int h; //감소값. 예제에서는 1/2 씩 감소하도록 설정함
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
