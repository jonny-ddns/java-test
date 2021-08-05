package lambda.pack02.ex201_consumer;

import java.util.function.*;

public class ConsumerTest {
    Consumer<String> c1 = a -> System.out.println("�Է°� : "+ a);
    BiConsumer<String, Integer> c2 =  (a, b) -> System.out.println("�Է°�1 : "+ a+ " �Է°�2 : "+ b);
    IntConsumer c3 = a -> System.out.println("�Է°� : "+ a);
    DoubleConsumer c4 = a -> System.out.println("�Է°� : "+ a);
    LongConsumer c5 = a -> System.out.println("�Է°� : "+ a);
    ObjIntConsumer<Student> c6 = (a, b) -> System.out.println("�̸� : "+ a.name+ " ���� : "+ b);
    ObjDoubleConsumer<Student> c7 = (a, b) -> System.out.println("�̸� : "+ a.name+ " ���� : "+ b);
    ObjLongConsumer<Student> c8 = (a, b) -> System.out.println("�̸� : "+ a.name+ " ���� : "+ b);

    class Student{
        private String name;
        Student(String name){this.name = name;};
    }

    public static void main(String[] args) {
        ConsumerTest test = new ConsumerTest();

        test.c1.accept("������");
        test.c2.accept("ȫ�浿", 123);
        test.c3.accept(456);
        test.c4.accept(123.45);
        test.c5.accept(1232345);

        Student student = test.new Student("�̼���");
        test.c6.accept(student, 12);
        test.c7.accept(student, 23.24);
        test.c8.accept(student, 98765);
    }
}
