package collectionFrameWork.Comparable_Comparator.ComparableEx;

public class Age_Comparable implements Comparable{
    //compareTo 메서드를 오버라이드하여 재정의
    @Override
    public int compareTo(Object o) {
        int result = 0;
        //숫자로 들어온 경우에 기준이 발동되도록 설정
        if(o instanceof Integer){
            int age =  (Integer) o;
            if(age > 19){
                System.out.println("환영합니다");
                result = 1;
            } else{
                System.out.println("입장 하실 수 없습니다");
                result = -1;
            }
            return result;
        }
        System.out.println("나이는 숫자를 넣어주세요");
        return 0;
    }
}
