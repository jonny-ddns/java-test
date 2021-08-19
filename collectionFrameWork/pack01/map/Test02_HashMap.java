package collectionFrameWork.pack01.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapStudent = new HashMap();

        String[] strArr = {"�迬��", "�̿��", "������", "�����", "������", "������"};
        Integer[] intArr = {92, 12, 68, 38, 84, 25};

        //map�� �� �ֱ�
        for(int i=0; i<strArr.length; i++){
            mapStudent.put(strArr[i], intArr[i]);
        }

        Set<String> setName = mapStudent.keySet();

        for(String str : setName){
            System.out.print(str+ " ");         //�迬�� ����� ������ ������ �̿�� ������

        }

        for(String str : setName){
            int score = mapStudent.get(str);
            System.out.println(str+ "�� ���� : "+ score);
        }
        /*
        �迬���� ���� : 92
        ������� ���� : 38
        �������� ���� : 25
        �������� ���� : 68
        �̿���� ���� : 12
        �������� ���� : 84
         */
    }
}
