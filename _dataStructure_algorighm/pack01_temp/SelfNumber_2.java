package _dataStructure_algorighm.pack01_temp;

import java.util.ArrayList;

public class SelfNumber_2 {
    private static ArrayList<Integer> numbersHasGenerator;

    public static void main(String[] args) {
        calculateNumbersHasGenerator();
        int sum = 0;
        for (int i = 0; i < 5001; i++)
            if (!hasGenerator(i))
                sum += i;
        System.out.println("гу : " + sum);
    }

    private static boolean hasGenerator(int num) {
        return numbersHasGenerator.contains(num);
    }   

    private static void calculateNumbersHasGenerator() {
        numbersHasGenerator = new ArrayList<>();
        for (int i = 0; i <= 5000; i++) {
            String num = String.valueOf(i);
            int no = 0;
            for (int n = 0; n < num.length(); n++)
                no += Integer.parseInt(num.substring(n, n + 1));
            numbersHasGenerator.add(no + i);
        }
    }
}