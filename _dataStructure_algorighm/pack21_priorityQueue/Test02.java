package _dataStructure_algorighm.pack21_priorityQueue;

import java.util.PriorityQueue;

public class Test02 {
    public static void main(String[] args) {
        PriorityQueue<Integer> que01 = new PriorityQueue<>();

        int count = 0;
        int num = 0;
        while(count < 1000){
            num = (int) (Math.random() * 100000) + 1;
            que01.add(num);
            System.out.println("num : "+ num);
            count++;
        }

        System.out.println("-------");
        for(int i: que01){
            System.out.println(i);
        }

        System.out.println("size : "+ que01.size());
        System.out.println("1 포함여부 : "+ que01.contains(1));
    }
}

