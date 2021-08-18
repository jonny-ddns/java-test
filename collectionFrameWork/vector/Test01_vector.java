package collectionFrameWork.vector;

import java.util.Iterator;
import java.util.Vector;

public class Test01_vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        String[] strArr = {"김연아", "추신수", "박찬호", "김연경", "심권호"};

        //반복문으로 vector라는 컬렉션에 값을 삽입하기
        //Vector는 List를 구현한 객체이다
        for(int i=0; i<strArr.length; i++){
            String name = strArr[i];
            vector.add(name);
        }

        //Iterator(반복자)를 이용해 값 가져오기
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            iterator.remove();      //값을 꺼내고 나서 삭제하기
            System.out.println(str);
        }

        int size = vector.size();
        System.out.println(size);       //0
    }
}
