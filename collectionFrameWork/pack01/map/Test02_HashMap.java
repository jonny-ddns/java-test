package collectionFrameWork.pack01.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapStudent = new HashMap();

        String[] strArr = {"김연아", "이용대", "박지성", "손흥민", "김자인", "류현진"};
        Integer[] intArr = {92, 12, 68, 38, 84, 25};

        //map에 값 넣기
        for(int i=0; i<strArr.length; i++){
            mapStudent.put(strArr[i], intArr[i]);
        }

        Set<String> setName = mapStudent.keySet();

        for(String str : setName){
            System.out.print(str+ " ");         //김연아 손흥민 류현진 박지성 이용대 김자인

        }

        for(String str : setName){
            int score = mapStudent.get(str);
            System.out.println(str+ "의 점수 : "+ score);
        }
        /*
        김연아의 점수 : 92
        손흥민의 점수 : 38
        류현진의 점수 : 25
        박지성의 점수 : 68
        이용대의 점수 : 12
        김자인의 점수 : 84
         */
    }
}
