package java_basic02.collectionFrameWork.pack01.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test03_TreeSet {
    public static void main(String[] args) {
        String[] strArr01 = {"ȫ�浿", "�Ӳ���", "�̼���", "ȫ�浿", "������", "���ż�", "������"};
        String[] strArr02 = {"�Ӳ���", "���ż�", "������", "ȫ�浿", "������", "�̼���", "ȫ�浿"};

        Set<String> nameSet01 = new TreeSet<>();
        Set<String> nameSet02 = new TreeSet<>();

        for(int i=0; i<strArr01.length; i++){
            nameSet01.add(strArr01[i]);
        }

        for(int i=0; i<strArr02.length; i++){
            nameSet02.add(strArr02[i]);
        }

        //set��� Ȯ��
        boolean equal01 = nameSet01.equals(nameSet02);
        System.out.println(equal01);    //true


        //�ݺ��ڸ� ���� ����غ���
        //TreeSet�� ��ҵ��� �������� ���ĵ� ���� Ȯ���� �� �ִ�
        Iterator<String> iterator01 = nameSet01.iterator();
        while (iterator01.hasNext()) {
            String str01 = iterator01.next();
            System.out.print(str01+ " ");   //������ ������ �̼��� �Ӳ��� ���ż� ȫ�浿
        }

        Iterator<String> iterator02 = nameSet01.iterator();
        while (iterator02.hasNext()) {
            String str01 = iterator02.next();
            System.out.print(str01+ " ");   //������ ������ �̼��� �Ӳ��� ���ż� ȫ�浿
        }
    }
}
