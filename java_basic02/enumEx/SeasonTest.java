package java_basic02.enumEx;

import java.util.Calendar;

public class SeasonTest {
    //열거타입으로 변수 선언하기
    Season season2021;

    //열거상수 값 할당하기
    //열거상수는 단독으로 사용할 수 없다. 앞에  "열거타입." 이 붙어야 한다
    Season summer2021 = Season.SUMMER;

    //null 값 할당도 가능하다
    Season summer2022 = null;


    public static void main(String[] args) {

//        Season season = new Season();

        Season spring = Season.SPING;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;

        Month[] months = Month.values();

        //Calendar 클래스에서 이번달 값 받아오기
        Calendar cal = Calendar.getInstance();
        int month = cal.get(2);

        Month whichMonth = months[month];
        System.out.println("whichMonth : "+ whichMonth);
        month += 1;

        int index = whichMonth.ordinal()/3;

        String seasonNow;
        String 지금;
        switch (index){
            case 0:
                seasonNow = winter.name();
                지금 = 계절.겨울.name();
                break;
            case 1:
                seasonNow = spring.name();
                지금 = 계절.봄.name();
                break;
            case 2:
                seasonNow = summer.name();
                지금 = 계절.여름.name();
                break;
            case 3:
                seasonNow = autumn.name();
                지금 = 계절.가을.name();
                break;
            default:
                seasonNow = winter.name();
                지금 = 계절.겨울.name();
        }

        System.out.printf("이번달은 %d월이구요. %s(%s)입니다", month, 지금, seasonNow);
    }
}
