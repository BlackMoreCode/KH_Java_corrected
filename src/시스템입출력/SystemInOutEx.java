package 시스템입출력;
//자바 표준 입출력 클래스 :
// System.in (표준 입력): 프로그램 내에서 사용자의 입력을 받음 (콘솔입력)
// System.out (표준 출력) : 프로그램 내의 결과를 콘솔에 출력 (리다이렉션 가능)
// print(메서드 오버로딩), println(메서드 오버로딩), printf(서식 지정자)
// System.err (표준 오류 출력) : 오류를 출력하기 위해서 사용 (리다이렉션 안됨; 대체제가 있음)
// 서식 지정자: %d(decimal), %ld(long decimal), %f(float), %.2f
// %5d (5칸의 공간을 잡고 오른쪽 정렬), %-5d(왼쪽 정렬), %s(string), %c(character)
// %% (%기호를 출력)
// 이스케이프 시퀀스 : \n(줄바꿈), \r(커서를 맨 앞으로), \t(탭), \b(백), \\ (\ 표시)

import java.util.Scanner;

public class SystemInOutEx {
    public static void main(String[] args) {
        String name = "Destiny draw";
        String addr = "Domino City";
        char gender = 'M';
        int age = 33;
        int kor = 89;
        int eng = 88;
        int math = 56;
        //println(), print() : 메서드 오버로딩
        System.out.println("======= Java Style 출력 =========");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + math));
        System.out.println("평균 : " + (double)(kor + eng + math) / 3);
        System.out.println(String.format("평균 : %.2f", (double)(kor + eng + math) / 3));

        // 서식 지정자 스타일
        System.out.printf("====== C Style 출력 ======\n");
        System.out.printf("이름 : %s\n", name); // %s는 문자열에 대한 서식
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender); //%c 는 문자형에 대한 서식
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + math);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + math) / 3);

    }

}
