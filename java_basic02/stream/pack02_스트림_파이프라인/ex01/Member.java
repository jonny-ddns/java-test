package java_basic02.stream.pack02_스트림_파이프라인.ex01;

public class Member {
    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int sex;
    private int age;

    Member(String name, int sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getSex(){ return sex; };
    public int getAge(){ return age; };

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
