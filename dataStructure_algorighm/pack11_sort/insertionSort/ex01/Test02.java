package dataStructure_algorighm.pack11_sort.insertionSort.ex01;

import dataStructure_algorighm.pack11_sort.SortFunctions;

public class Test02 {
    private final SortFunctions sortFunctions = new SortFunctions();

    public void sort(int[] intArr){
        int i;      //외부 반복자. 두번째부터 n번째까지 정렬할 값 가져오기
        int j;      //내부 반복자. 정렬된 값을 하나씩 가져와서 i와 비교할 변수
        int value;  //비교할 실제값
        for(i=1; i< intArr.length; i++){
//            System.out.println("i : "+ i);
            //값 대입하기
            j = i-1;        //
            value = intArr[i];   //두번째부터 n번째까지 값을 담는 변수


            /*
            -뒤에 있는 값을 모두 한칸씩 밀어줘야 하기 때문에 while 문 사용
            -배열의 앞에서부터 뒤로 밀면 바로 뒤에 있는 값과 충돌한다
              때문에 뒤에서부터 한칸씩 밀어주고 배열은 0미만의 값이 허용되지 않기 때문에
              (j>=0)조건을 넣는다
             */
            //새로 추가할 값이 배열의 j번째보다 작다면 뒤쪽 배열의 값을 뒤로 한칸씩 밀기
            while(j >= 0 && value < intArr[j]){
//                System.out.println("j : "+ j);
//                System.out.println("a[j] : "+ a[j]+ " | value : "+ value);
//                System.out.println("a[j] 한 칸 밀기 ");

                intArr[j+1] = intArr[j];	//배열을 한칸씩 뒤로 밀기
//                System.out.println("j : "+ j);
                j--;    //배열의 한 칸 앞에 있는 값과 다시 비교하기 위한 코드
            }
            
            //j+1번째에 새로운 값을 할당하기
            intArr[j+1] = value;
//            sortFunctions.printArr(a);
//            System.out.println();
        }
    }


//    public void test2(){
//        int i;
//        int j;
//        int value;  //비교후 삽입할 값
//        for(i=1; i< a.length; i++){
//            j = i-1;
//            value = a[i];
//
//            while(j>=0 && a[i] < a[j]){
//                System.out.println("a[i] : "+ a[i]+ " | value : "+ value);
//                a[j + 1] = a[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
//                j--;
//            }
//            a[j + 1] = value;
//            sortFunctions.printArr(a);
//        }
//    }
}
