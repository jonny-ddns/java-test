package java_basic02.stream.pack02_��Ʈ��_����������.ex08_����;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public enum Sex {MALE, FEMALE}
    public enum City {SEOUL, BUSAN}

    class Student{
        private String name;
        private int score;
        private Sex sex;
        private City city;

        private Student(){
        }

        private Student(String name, int score){
            this.name = name;
            this.score = score;
        }

        private Student(String name, int score, Sex sex){
            this.name = name;
            this.score = score;
            this.sex = sex;
        }

        private Student(String name, int score, Sex sex, City city){
            this.name = name;
            this.score = score;
            this.sex = sex;
            this.city = city;
        }

        public String getName() {
            return name;
        }
        public int getScore() {
            return score;
        }
        public Sex getSex() {
            return sex;
        }
        public City getCity() {
            return city;
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        List<Student> list = Arrays.asList(
                t.new Student("�̼���", 25, Sex.MALE, City.BUSAN),
                t.new Student("�̼���", 55, Sex.FEMALE, City.SEOUL),
                t.new Student("�̼���", 74, Sex.FEMALE, City.BUSAN),
                t.new Student("�̼���", 17, Sex.MALE, City.SEOUL),
                t.new Student("�̼���", 35, Sex.FEMALE, City.SEOUL)
        );

        System.out.println("--List -Male");
        List<Student> listMale = list.stream()
                                    .filter(a -> a.getSex() == Sex.MALE)
                                    .collect(Collectors.toList());
        listMale.stream()
                .forEach(a-> System.out.print(a.getName()+ " "));

        System.out.println("\n--Set -�λ�");
        Set<Student> setFemale = list.stream()
                                    .filter(a -> a.getCity() == City.BUSAN)
                                    .collect(Collectors.toCollection(HashSet::new));
        setFemale.stream()
                 .forEach(a -> System.out.print(a.getName()+ " "));
    }
}