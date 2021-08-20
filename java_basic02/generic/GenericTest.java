package java_basic02.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    List<String> nameList = new ArrayList<>();

    public static void main(String[] args) {
        GenericTest ge = new GenericTest();

        String[] nameArr = {"나폴레옹", "알렉산드로스", "카이사르", "한니발"};
        for(String name : nameArr){
            ge.makeList(name);
        }
    }

    List<String> makeList(String name){
        nameList.add(name);
        return nameList;
    }
}
