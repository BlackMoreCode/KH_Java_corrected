package 스캐너클래스;
// 기본적인 데이터 타입에 대한 입력을 Scacnner 클래스 메서드를 사용하여 입력 받을 수가 있음

import java.util.Scanner;	// Scanner 클래스 호출; 스캐너 클래스는 util 패키지 내에 존재하므로 import 해야한다.

public class ScannerEx {
    public static void main(String[] args) {
        // sc : 스캐너 클래스에 대한 참조 변수 (Scanner 클래스로 만들어지 객체의 주소)
        // new : heap 메모리 할당, 동적 할당, 메모리에 대한 해제를 해야함.
        // System.in : 콘솔로 부터 입력을 받기 위한 객체로 생성
        Scanner sc = new Scanner(System.in);	// Scanner 객체 생성

        byte a = sc.nextByte(); 		// byte 형에 대한 입력을 받아서 반환
        short b = sc.nextShort(); 		// short 형에 대한 입력을 받아서 반환
        int c = sc.nextInt(); 			// int 형에 대한 입력을 받아서 반환
        long d = sc.nextLong(); 		// long 형에 대한 입력을 받아서 반환
        // next() : 공백 기준으로 문자열을 입력 받음, 그중에 해당 인덱스의 문자를 추출
        char ch = sc.next().charAt(0); // 스캐너는 문자에 대한 입력 방식 없음

        float e = sc.nextFloat(); 		// float 형 입력 및 리턴
        double f = sc.nextDouble(); 	// double 형 입력 및 리턴

        boolean g = sc.nextBoolean(); 	// boolean 형 입력 및 리턴

        String h = sc.next(); 			// String 형 입력 및 리턴 (공백을 기준으로 문자열 입력 받음; 한 단어를 읽음)
        String i = sc.nextLine(); 		// String 형 입력 및 리턴 (개행/줄바꿈을 기준으로 문자열 입력 받음; 한 줄을 읽음)
    }
}