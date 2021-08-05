package collectionFrameWork.stackandQueue;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        //Stack에 객체 추가하기
        stack.push("달팽이");
        stack.push("나비");
        stack.push("고양이");
        stack.push("하마");
        stack.push("코끼리");

        //.peek() -> 삭제하지 않고 최상단의 값 가져오기
        System.out.println(stack.peek());   //코끼리
        System.out.println(stack.peek());   //코끼리
        System.out.println(stack.peek());   //코끼리

        System.out.println(stack.pop());   //코끼리
        System.out.println(stack.pop());   //하마
        System.out.println(stack.pop());   //고양이
        System.out.println(stack.pop());   //나비
        System.out.println(stack.pop());   //달팽이

        System.out.println(stack.empty());  //true

        //다시 값 추가
        stack.push("토끼");
        stack.push("여우");
        stack.push("하이에나");
        stack.push("치타");

        int count = stack.search("하이에나");
        System.out.println(count);  //2 -> 위에서 2번째 위치해있다
    }
}
