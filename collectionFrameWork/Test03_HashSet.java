package collectionFrameWork;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03_HashSet {
    public static void main(String[] args) {

        Set<String> nameSet01 = new HashSet<>();
        Set<String> nameSet02 = new HashSet();

        String[] strArr = {"ȫ�浿", "�Ӳ���", "�̼���", "ȫ�浿", "������", "���ż�", "������"};

        for(int i=0; i< strArr.length; i++){
            nameSet01.add(strArr[i]);
        }

        for(int i=0; i< strArr.length; i++){
            nameSet02.add(strArr[i]);
        }

        //set�� �ߺ��� ������� �����Ƿ� "ȫ�浿"�� 1���� ����
        int size01 = nameSet01.size();
        System.out.println(size01);         //6

        boolean contain01 = nameSet01.contains("ȫ�浿");
        boolean contain02 = nameSet01.contains("�迬��");
        System.out.println(contain01);          //true
        System.out.println(contain02);          //false

        //Set�� ��� Ȯ��
        boolean isEqual01 = nameSet01.equals(nameSet02);
        System.out.println(isEqual01);            //true

        //��� ����
        boolean remove01 = nameSet01.remove("���ż�");
        boolean remove02 = nameSet01.remove("�̺�â");
        System.out.println(remove01);       //true
        System.out.println(remove02);       //false

        //Set�� ��� Ȯ��
        boolean isEqual02 = nameSet01.equals(nameSet02);
        System.out.println(isEqual02);       //false

        //iterator() �޼��带 ����� �ݺ��� ��������
        Iterator<String> iterator = nameSet01.iterator();

        //��� ��������
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.printf(name+ " ");   //������ ȫ�浿 ������ �̼��� �Ӳ���
        }
    }
}
