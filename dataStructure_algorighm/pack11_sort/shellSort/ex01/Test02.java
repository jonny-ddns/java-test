package dataStructure_algorighm.pack11_sort.shellSort.ex01;

//그룹 감소값 새로 지정해 알고리즘 구성
public class Test02 {
    public void sort(int[] a){
        int n = a.length;
        int i;      //반복자1
        int j;      //반복자2
        int tmp;    //임시로 값을 받는 변수
        int h; //감소값. 예제에서는 1/2 씩 감소하도록 설정함

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
