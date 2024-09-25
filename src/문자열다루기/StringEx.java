package 문자열다루기;
// 문자열이란? 문자가 연속적으로 존재하는 데이터 형
// 자바에서는 문자와 문자열을 구분한다! "" 문자열  //  '' 문자
// 자바는 문자열을 참조 타입으로 간주한다.
// 문자열을 표현하기 위해서는 갳레를 만들어 사용하거나 리터럴 표기 방식으로 사용
// 리터럴 표기 방식이 가독성 및 성능에서 유리하다.

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        String name = new String("곰돌이사육사");
        String name2 = "곰돌이사육사"; // 이 방식이 리터럴 표기 방식. 이 방식이 더 권장된다.
        // 문자열 내장 메서드
        // equals() : 2개의 문자열 내용이 동일한지 비교하여 결과를 반환.
        String a = "hello";
        String b = "Hello";
        System.out.println(a.equals(b)); // false
        System.out.println(a.equalsIgnoreCase(b)); // true
        System.out.println(a == b); //주소가 같는지 물어본다. false

        // indexOf() : 문자열에서 특정 문자가 시작되는 인덱스 반환
        String c = "Hello Java";
        System.out.println(c.indexOf("Java")); // 6

        // contains() : 문자열에서 특정 문자열이 포함되어 있는지 여부를 반환
        // 위 String c 재사용
        System.out.println(c.contains("Hello"));

        // chatAt() : 문자에서 특정 위치의 문자를 리턴
        System.out.println(c.charAt(6));

        // 실습문제: 대문자, 소문자로 이루어진 문자열을 받아서 대문자-> 소문자 변환, vice versa
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String d = sc.next();
        String answer = "";


        // 메서드 사용 안하고 문자 크기를 이용했다면:
        for (int i = 0; i < d.length(); i++) {
            char case_reverse = d.charAt(i);
            if (case_reverse < 'a') System.out.print((char)(case_reverse + ('a' - 'A')));
            else System.out.print((char)(case_reverse - ('a' - 'A')));
        }
        System.out.println();

        // 이 방식은 메서드 (toUpperCase / toLowerCase)를 사용했다.
        for (int i = 0; i < d.length(); i++) {
            char case_reverse = d.charAt(i);
            if (Character.isUpperCase(case_reverse)) {
                answer += Character.toLowerCase(case_reverse);
            } else {
                answer += Character.toUpperCase(case_reverse);
            }
        }
        System.out.println(answer);

        //실습 문제 입력 받은 문자열을 반대로 출력
        // ex. abcdef -> fedcba
        // 방법 1. 반대로 읽기
        // 방법 2. reverse() 사용
        System.out.println("문자열을 입력하세요 : ");
        String f = sc.next();
        String reversed_f ="";

        //for문을 이용, 끝에서 부터 앞으로 진행시
        for (int i = f.length() - 1; i >= 0; i--) {
            char order_reverse = f.charAt(i);
            reversed_f += order_reverse;
        }
        System.out.println(reversed_f);

        // String Buffer 클래스의 reverse() 이용시?
        StringBuffer sb = new StringBuffer(f);
        String reversed_f_bff = sb.reverse().toString();
        System.out.println(reversed_f_bff);

        //replace(): 특정 문자열을 다른 문자열로 대체
        String h = "안녕하세요, JAVA를 공부하겠습니다.";
        System.out.println(h.replace("JAVA", "Python"));

        //replaceAll() : 정규식 적용 가능
        System.out.println(h.replaceAll("JAVA", "Python"));

        //substring() : 문자열에서 특정 문자열을 뽑아낼 때 사용
        //python 의 slice 같은 느낌이다.
        String j = "DAMN YOU";
        System.out.println(j.substring(5)); //5에서 부터 시작
        System.out.println(j.substring(0, 4)); //인덱스 0에서 부터 4 미만

        // toUpperCase() : 전부 대문자로 바꾸기
        System.out.println(j.toUpperCase());
        // toLowerCase() : 전부 소문자료 변환
        System.out.println(j.toLowerCase());

        // trim(): 문자열의 앞/뒤 공백 제거
        String k = "       heeeeeeey youuuu.    What do you want?       ";
        System.out.println(k.trim());

        // split(): 문자열을 특정 문자열 기준으로 분리하는 메서드
        String l = "23:45:56";
        String[] timeStr = l.split(":");
        for(String el : timeStr) {
            System.out.println(el + " ");
        }
        System.out.println(timeStr[0] + "시" + timeStr[1] + "분" + timeStr[2] + "초");

        //문자열 포매팅 : 서식을 지정해서 문자열 만드는 것
        //System.out.printf(), String.format()
        System.out.printf("오늘의 온도는 %d입니다.\n", 35);
        String otherStr = String.format("오늘의 온도는 %d입니다.\n", 35);

        //toCharArray() : 문자열을 문자 배열로 반환
        String strVal = "whatdoyouwant";
        char[] chArray= strVal.toCharArray();
        for (char e : chArray) {
            System.out.print(e + " "); // w h a t d o y o u w a n t
        }
    }

}
