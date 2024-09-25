package KMP암호화;
// Knutt-Moriss-Pratt => KMP
// Korea-Seoul => KS
// Mirko-Slavko => MS

import java.util.Scanner;

// 여라가지 방법 중 택 1
// 풀기 위해서 대문자만 골라서 찍기
// 0번째 문자 출력, '-' 다음 문자 출력
// split("-") 기준으로 잘라내고 각 배열의 0번째 문자 출력
// toCharArray()를 사용해서 배열로 만들고 대문자만 골라내기

public class KmpRx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String name = sc.next();

        // 대문자만 골라 찍기
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                System.out.print(name.charAt(i));
            }
        }


        // 0번째 문자 출력, 그 뒤 '-' 다음 문자 출력
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) System.out.print(i);
            else {
                if (name.charAt(i) == '-') System.out.print(i + 1);
            }
        }


        // toCharArray() 사용 예시
        System.out.println("문자열 입력 : ");
        String name_method4 = sc.next();
        char[] nameArray = name_method4.toCharArray();
        String Answer = "";
        for (char e : nameArray) {
            if (Character.isUpperCase(e)) {
                Answer += e;
            }
        }
        System.out.println(Answer);

    }
}
