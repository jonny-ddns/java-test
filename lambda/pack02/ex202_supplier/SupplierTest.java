package lambda.pack02.ex202_supplier;

import java.util.function.*;

public class SupplierTest {
    public static void main(String[] args) {
        String stringValue = "helloWorld";
        boolean booleanValue = true;
        double doubleValue = 13245.123;
        int intValue = 123;
        long longValue = 1234567;

        Supplier<String> supplier = () -> stringValue;
        BooleanSupplier booleanSup =  () -> booleanValue;
        DoubleSupplier doubleSup = () -> doubleValue;
        LongSupplier longSup = () -> longValue;
        IntSupplier intSup = () -> intValue;

        SupplierTest test = new SupplierTest();

        String s = supplier.get();
        System.out.println("String �� : "+ s);

        boolean b = booleanSup.getAsBoolean();
        System.out.println("boolean �� : "+ b);

        double d = doubleSup.getAsDouble();
        System.out.println("double �� : "+ d);

        long l = longSup.getAsLong();
        System.out.println("long �� : "+ l);

        int i = intSup.getAsInt();
        System.out.println("int �� : "+ i);
    }
}
