package collectionFrameWork;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03_HashSet {
    public static void main(String[] args) {

        Set<String> nameSet01 = new HashSet<>();
        Set<String> nameSet02 = new HashSet();

        String[] strArr = {"홍길동", "임꺽정", "이순신", "홍길동", "김유신", "혁거세", "윤봉길"};

        for(int i=0; i< strArr.length; i++){
            nameSet01.add(strArr[i]);
        }

        for(int i=0; i< strArr.length; i++){
            nameSet02.add(strArr[i]);
        }

        //set은 중복을 허용하지 않으므로 "홍길동"은 1번만 들어간다
        int size01 = nameSet01.size();
        System.out.println(size01);         //6

        boolean contain01 = nameSet01.contains("홍길동");
        boolean contain02 = nameSet01.contains("김연아");
        System.out.println(contain01);          //true
        System.out.println(contain02);          //false

        //Set의 동등성 확인
        boolean isEqual01 = nameSet01.equals(nameSet02);
        System.out.println(isEqual01);            //true

        //요소 삭제
        boolean remove01 = nameSet01.remove("혁거세");
        boolean remove02 = nameSet01.remove("이봉창");
        System.out.println(remove01);       //true
        System.out.println(remove02);       //false

        //Set의 동등성 확인
        boolean isEqual02 = nameSet01.equals(nameSet02);
        System.out.println(isEqual02);       //false

        //iterator() 메서드를 사용해 반복자 가져오기
        Iterator<String> iterator = nameSet01.iterator();

        //요소 가져오기
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.printf(name+ " ");   //윤봉길 홍길동 김유신 이순신 임꺽정
        }
    }
}
