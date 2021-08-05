package stream.pack01_스트림얻기.List_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Test {
    class Student{
        private int stuNum;
        private String stuName;
        private boolean isCome;

        Student(int stuNum, String stuName, boolean isCome){
            this.stuNum = stuNum;
            this.stuName = stuName;
            this.isCome = isCome;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "stuNum=" + stuNum +
                    ", stuName='" + stuName + '\'' +
                    ", isCome=" + isCome +
                    '}';
        }
    }

    public static void main(String[] args) {
        Test t = new Test();

        Student stu1 = t.new Student(1, "조성모", true);
        Student stu2 = t.new Student(2, "이승기", false);
        Student stu3 = t.new Student(3, "윤도현", false);

        //List 에 요소 추가하고 스트림 얻기
        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        Stream<Student> stuStream = list.stream();
        stuStream.forEach( a -> System.out.println(a.toString()) );

        //Set 에 요소 추가하고 스트림 얻기
        Set<Student> set = new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        set.stream()
                .forEach(a -> System.out.println(a));
    }
}
