package 호수판문제;
// 각 번호판의 자리수를 계산하기 위한 배열 생성
// 총 자리수를 누적하기 위한 변수 생성
// 결과를 한번에 출력해야하기 때문에 최대 100개의 결과 저장 배열 생성
// 배열은 인덱스 계산이 필요; 인덱스 변수 생성해야한다
// 스캐너 입력을 위한 객체 생성

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 무한 반복문 생성 (0이 언제 입력될지 모르기 때문이다)
// 스캐너를 통해 문자열을 입력 받아 문자열이 "0" 이면 반복문 탈출
// 입력 받은 문자열 길이 만큼을 순회하면서 문자 추출 후 정수 자리수로 변환하여 자리 수 추출
// charAt(i) - '0' ; 0 아스키 숫자 값만큼 빼준다?
// 결과 값을 저장하고 배열 인덱스 증가
// 총 자리수 누적을 위한 변수 초기화
// 결과 출력
public class SignBoardMain {
//    public static void main(String[] args) {
//        int[] numSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3}; // 0~9 숫자의 너비. 각 자리에 대한 번호 크기
//        int sum = 0;
//        int[] result = new int[100];
//        int index = 0;
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            String num = sc.nextLine();
//            if (num.equals("0")) break;
//            for (int i = 0; i < num.length(); i++) {
//                sum += numSize[num.charAt(i) - '0'] + 1; // +1은 각 숫자 앞의 공백
//            }
//            result[index++] = sum + 1; // 1은 마지막의 공백
//
//            sum = 0; // 초기화
//        }
//
//        for (int i = 0; i < index; i++) {
//            System.out.println(result[i]);
//        }
//    }
    // ArrayList를 이용해서 구현시...
    public static void main(String[] args) {
        int[] numSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3}; // 0~9 숫자의 너비. 각 자리에 대한 번호 크기
        int sum = 0;
        List<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String num = sc.nextLine();
            if (num.equals("0")) break;
            for (int i = 0; i < num.length(); i++) {
                sum += numSize[num.charAt(i) - '0'] + 1;
            }
            result.add(sum + 1); // 리스트의 마지막 인덱스에 값이 추가된다
            sum = 0;
        }
        for (int e : result) System.out.println(e);
    }
}

