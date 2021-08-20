package java_basic02.lambda.pack02.ex204_operator;

//        BinaryOperator binaryOperator;
//        IntBinaryOperator intBinaryOperator;
//        DoubleBinaryOperator doubleBinaryOperator;
//        IntUnaryOperator intUnaryOperator;
//        LongBinaryOperator longBinaryOperator;
//        LongUnaryOperator longUnaryOperator;
//        UnaryOperator unaryOperator;

import java.util.function.IntBinaryOperator;

public class Test01 {

    int[] scores = {12, 35, 44, 26, 82};

    public int maxOrMin(IntBinaryOperator operator){
        int result = scores[0];
        for(int score : scores){
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {

        Test01 test = new Test01();
        int max = test.maxOrMin(
            (a, b) -> {
                if( a >= b){ return a;}
                else{ return b;}
                }
        );
        System.out.println("ÃÖ´ñ°ª : "+ max);
        
        int min = test.maxOrMin(
                (a, b) -> {
                    if( a <= b){ return a;}
                    else{ return b;}
                }
        );
        System.out.println("ÃÖ¼Ú°ª : "+ min);
    }
}
