package 조건문;
// 제어문: 프로그램의 순차적인 흐름을 제어 할 때 사용
// 제어문에는 조건문과 반복문이 있음
// 조건문 :
// ~ if, if ~ else, if ~ else if ~ else
// ~ switch ~ case 문
// ~ 삼항 연산자

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 값 입력 : ");
//        int num = sc.nextInt();
//
//        // 내용이 한줄이면 {} 제외 가능.
//        if (num > 100) System.out.println(num + "이 100보다 큽니다.");
//        else if (num < 100) System.out.println(num + "이 100보다 작습니다.");
//        else System.out.println(num + "은 100이다!");

        System.out.print("문자를 입력 : ");
        Scanner sc = new Scanner (System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.print(ch + "는 소문자 입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.print(ch + "는 대문자 입니다.");
        } else {
            System.out.print(ch + "는 알파벳이 아닙니다");
        }
    }
}
