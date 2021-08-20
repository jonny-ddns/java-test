package java_basic02.generic;

import java.util.Vector;

public class Test01 {
    public static void main(String[] args) {

        Vector<Boolean> yesOrNo = new Vector<>();

        yesOrNo.add(true);
        yesOrNo.add(false);
        yesOrNo.add(true);
        yesOrNo.add(true);
        yesOrNo.add(false);

        printAnswer(yesOrNo, 3);
    }

    static boolean printAnswer(Vector<Boolean> vector, int index){
        boolean result = false;
        if(index > vector.size() -1){
            return false;
        }
        result = vector.get(index);
        return result;
    }
}
