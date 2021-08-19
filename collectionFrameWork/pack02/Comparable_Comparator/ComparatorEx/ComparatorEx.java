package collectionFrameWork.pack02.Comparable_Comparator.ComparatorEx;

import java.util.Comparator;

public class ComparatorEx implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        //리턴할 변수 선언
        int result = -1;
        if(o1 instanceof Integer && o2 instanceof Integer){

            //비교를 위해 형변환하여 int형 변수에 값 대입하기
            int int01 = (int) o1;
            int int02 = (int) o2;

            if(int01*2 == int02){
                result = 1;
            } else {
                result = 0;
            }
        }
        return result;
    }
}
