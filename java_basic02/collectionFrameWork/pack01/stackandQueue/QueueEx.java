package java_basic02.collectionFrameWork.pack01.stackandQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue foods = new LinkedList();

        foods.add("된장찌개");
        foods.add("콩나물국밥");
        foods.add("청국장");
        foods.add("김치찌개");
        foods.add("불고기");

        //가장 앞에 있는 값 가져오기
        //.element() 는 리턴타입이 Object이기 때문에 다운캐스팅 해준다
        String foodFirst = (String) foods.element();
        System.out.println(foodFirst);

        String food01 = (String) foods.peek();
        String food02 = (String) foods.peek();
        String food03 = (String) foods.peek();

        //.peek() 은 삭제하지 않고 가장 앞에 있는 값을 가져온다
        System.out.println(food01);
        System.out.println(food02);
        System.out.println(food03);

        //.poll()은 삭제하면서 가장 앞에 있는 값을 가져온다
        String food11 = (String) foods.poll();
        String food12 = (String) foods.poll();
        String food13 = (String) foods.poll();
        String food14 = (String) foods.poll();
        String food15 = (String) foods.poll();

        System.out.println(food11);
        System.out.println(food12);
        System.out.println(food13);
        System.out.println(food14);
        System.out.println(food15);
    }
}
