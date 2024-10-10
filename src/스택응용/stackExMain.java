package 스택응용;

import ArrayList응용예제.Product;

import java.util.Scanner;
import java.util.Stack;
// 괄호의 닫힘 여부를 스택으로 확인하는 방법
public class stackExMain {
    public static void main(String[] args) {
        //Character 는 char의 객체 타입
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        // 입력 받은 문자열 길이 만큼 반복문 순회
        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '(') {
                st.push(ch); // 열림 괄호 일 때 push
            } else if(ch == ')') {
                if(!st.isEmpty())st.pop(); // 닫힘 괄호 일 때 pop
                else {  // 이미 비어있는데 ')' 가 오는 경우
                    System.out.println("괄호가 일치 하지 않습니다 => 1번 케이스.");
                    return;
                }
            }
        }
        if(st.isEmpty()) {
            System.out.println("괄호가 일치 합니다.");
        } else {    // 앞에 '(' 가 더 많을 경우
            System.out.println("괄호가 일치 하지 않습니다 => 2번 케이스.");
        }

    }
}


