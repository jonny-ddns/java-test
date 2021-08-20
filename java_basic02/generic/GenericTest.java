package java_basic02.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    List<String> nameList = new ArrayList<>();

    public static void main(String[] args) {
        GenericTest ge = new GenericTest();

        String[] nameArr = {"��������", "�˷����ν�", "ī�̻縣", "�ѴϹ�"};
        for(String name : nameArr){
            ge.makeList(name);
        }
    }

    List<String> makeList(String name){
        nameList.add(name);
        return nameList;
    }
}
