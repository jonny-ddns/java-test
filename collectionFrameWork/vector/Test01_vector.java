package collectionFrameWork.vector;

import java.util.Iterator;
import java.util.Vector;

public class Test01_vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        String[] strArr = {"�迬��", "�߽ż�", "����ȣ", "�迬��", "�ɱ�ȣ"};

        //�ݺ������� vector��� �÷��ǿ� ���� �����ϱ�
        //Vector�� List�� ������ ��ü�̴�
        for(int i=0; i<strArr.length; i++){
            String name = strArr[i];
            vector.add(name);
        }

        //Iterator(�ݺ���)�� �̿��� �� ��������
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            iterator.remove();      //���� ������ ���� �����ϱ�
            System.out.println(str);
        }

        int size = vector.size();
        System.out.println(size);       //0
    }
}
