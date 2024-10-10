package 스택기본;

import java.util.Stack;
// Stack은 LIFO - Last In First Out; 프로그래밍에서는 함수 호출 구조가 대표적인 케이스
// 일상생활이라면 접시 쌓기 라던지...
// Stack은 내부적으로 Vector 클래스를 상속 받아서 사용
// push(객체) : 객체를 저장
// peek(): 스택의 최상위의 값 확인
// pop() : 스택위 최상위 값 추출하면서 보여준다.
// empty() : 스택이 비어있는지 확인

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // 최상위 값 확인
        System.out.println(stack.pop()); // 최상위 값 추출 및 확인
        System.out.println(stack.empty()); // 스택이 비어있는지 확인
        System.out.println(stack.size()); // 스택의 사이즈 확인
        System.out.println(stack.contains(1)); // 스택내에 해당 값이 있는지 확인 (이 경우 1 이 있는지 확인)
    }
}
