package collectionFrameWork.Comparable_Comparator.ComparableEx;

public class Age_Comparable implements Comparable{
    //compareTo �޼��带 �������̵��Ͽ� ������
    @Override
    public int compareTo(Object o) {
        int result = 0;
        //���ڷ� ���� ��쿡 ������ �ߵ��ǵ��� ����
        if(o instanceof Integer){
            int age =  (Integer) o;
            if(age > 19){
                System.out.println("ȯ���մϴ�");
                result = 1;
            } else{
                System.out.println("���� �Ͻ� �� �����ϴ�");
                result = -1;
            }
            return result;
        }
        System.out.println("���̴� ���ڸ� �־��ּ���");
        return 0;
    }
}
