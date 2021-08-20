package java_basic02.generic.school;

import java.util.ArrayList;
import java.util.List;

public class StudentEnroll {
    public static void main(String[] args) {
        List<Student> attendance = new ArrayList<>();
        Student student01 = new Student("À±µ¿ÁÖ", 20200104, 3);
        Student student02 = new Student("¹Ú¸ñ¿ù", 20210618, 2);
        Student student03 = new Student("±è¼Ò¿ù", 20190204, 4);

        attendance.add(student01);
        attendance.add(student02);
        attendance.add(student03);

        student01.toString();
    }
}
