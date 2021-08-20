package java_basic02.enumEx;

import java.util.Calendar;

public class SeasonTest {
    //����Ÿ������ ���� �����ϱ�
    Season season2021;

    //���Ż�� �� �Ҵ��ϱ�
    //���Ż���� �ܵ����� ����� �� ����. �տ�  "����Ÿ��." �� �پ�� �Ѵ�
    Season summer2021 = Season.SUMMER;

    //null �� �Ҵ絵 �����ϴ�
    Season summer2022 = null;


    public static void main(String[] args) {

//        Season season = new Season();

        Season spring = Season.SPING;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;

        Month[] months = Month.values();

        //Calendar Ŭ�������� �̹��� �� �޾ƿ���
        Calendar cal = Calendar.getInstance();
        int month = cal.get(2);

        Month whichMonth = months[month];
        System.out.println("whichMonth : "+ whichMonth);
        month += 1;

        int index = whichMonth.ordinal()/3;

        String seasonNow;
        String ����;
        switch (index){
            case 0:
                seasonNow = winter.name();
                ���� = ����.�ܿ�.name();
                break;
            case 1:
                seasonNow = spring.name();
                ���� = ����.��.name();
                break;
            case 2:
                seasonNow = summer.name();
                ���� = ����.����.name();
                break;
            case 3:
                seasonNow = autumn.name();
                ���� = ����.����.name();
                break;
            default:
                seasonNow = winter.name();
                ���� = ����.�ܿ�.name();
        }

        System.out.printf("�̹����� %d���̱���. %s(%s)�Դϴ�", month, ����, seasonNow);
    }
}
