package java_basic02.collectionFrameWork.pack01.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test03_TreeSet {
    public static void main(String[] args) {
        String[] strArr01 = {"홍길동", "임꺽정", "이순신", "홍길동", "김유신", "혁거세", "윤봉길"};
        String[] strArr02 = {"임꺽정", "혁거세", "윤봉길", "홍길동", "김유신", "이순신", "홍길동"};

        Set<String> nameSet01 = new TreeSet<>();
        Set<String> nameSet02 = new TreeSet<>();

        for(int i=0; i<strArr01.length; i++){
            nameSet01.add(strArr01[i]);
        }

        for(int i=0; i<strArr02.length; i++){
            nameSet02.add(strArr02[i]);
        }

        //set동등성 확인
        boolean equal01 = nameSet01.equals(nameSet02);
        System.out.println(equal01);    //true


        //반복자를 통해 출력해보면
        //TreeSet의 요소들이 오름차순 정렬된 것을 확인할 수 있다
        Iterator<String> iterator01 = nameSet01.iterator();
        while (iterator01.hasNext()) {
            String str01 = iterator01.next();
            System.out.print(str01+ " ");   //김유신 윤봉길 이순신 임꺽정 혁거세 홍길동
        }

        Iterator<String> iterator02 = nameSet01.iterator();
        while (iterator02.hasNext()) {
            String str01 = iterator02.next();
            System.out.print(str01+ " ");   //김유신 윤봉길 이순신 임꺽정 혁거세 홍길동
        }
    }
}
