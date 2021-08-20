package java_basic02.scannerTest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random()*100)+1;
        Scanner scan = null;
        scan = new Scanner(System.in);
        int count = 0;

        do{
            try{
                Thread.sleep(200);
            } catch (Exception e){

            }

            count++;
            System.out.println("------입력하세요");
//            scan = new Scanner(System.in);
            try{
                System.out.println("input : "+ input);

//                scan.close();


                input = scan.nextInt();
                System.out.println("input : "+ input);
                input = scan.nextInt();
                System.out.println("input : "+ input);
            } catch (Exception e){
                System.out.println("잘못 입력");
                e.printStackTrace();
                continue;
            }


            System.out.println("do 종료");
        } while (input != answer);
        System.out.println("count : "+ count);
        scan.close();
    }
}
