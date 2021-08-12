package date_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test01 {
    public static void main(String[] args) {
        Date date01 = new Date();
        System.out.println(date01);

        Date date02 = new Date();
        String string02 = date02.toString();
        System.out.println(string02);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        System.out.println(sdf.format(new Date()));

        Date date03 = new Date();
        String string03 = sdf.format(date03);
        System.out.println(string03);
    }
}
