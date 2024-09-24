package 기본연습;
/*
    Date : 2024.09.23
    Author : 김태우
    Purpose : 연습용 프로그램
 */ // 범위주석

public class BasicEx {
    // public은 접근 제한자, 정적 메서드, void는 반환값이 없음을 의미
    // main은 프로그램의 시작 지점, 프로그램 실행 시 인자값을 받기 위한 부분
    public static void main(String[] args)
    {
        System.out.println("안녕하세요. 자바를 시작 합니다.");
        System.out.print(7); //정수값을 출력하고 줄 바꿈 없음
        System.out.println(700);
        System.out.println("문자열을 이어서" + "출력하기");
        System.out.println("성적 : " + 98 + 100); // 성적 98100, 문자열이 앞에 있으면 뒤에도 전부 문자열
        System.out.println( 100 + 200 + "점수"); // 결합 순서에 따라 출력이 달라짐 정수가 앞에 있으면 정수계산하고 문자열
        System.out.printf("%d점\n", 300); // %d == decimal
        System.out.printf("%s\n", "경기도 수원시"); // %s == string
        char gender = 'A'; // JAVA는 문자와 문자열은 다르다, ' ' = 문자,아스키코드값 " "= 문자열
        System.out.printf("%d\n",(int)gender);
        System.out.printf("%c\n", gender); // %c == charator
        System.out.printf("%.2f\n", 3.1459245);
        //기본타입은 첫글자가 소문자, 참조타입은 대문자
        //참조타입은 주소를 찾아서 값을 가져옴
        int age =23;
        String name = "곰돌이사육사";
    }
}
