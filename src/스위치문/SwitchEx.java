package 스위치문;
// switch문은 if문과 마찬가지로 조건 제어문
// if 문은 조거신의 결과가 true/false에 따라 분기
// switch문은 변수의 값에 따라서 실행문이 결정된다
//switch(변수){
//    case 값: 정수, 문자, 문자열이 올 수 있다
//        실행문
//        break; // 실행문을 벗어남
//        }

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args){
        String name = "곰돌이사육사";
        String addr = "곰돌이사육사";
        String city = new String("곰돌이사육사"); // 리터럴 상수가 아니다! 힙 영역에 메모리 잡았다 = 주소가 달라진다
        String city2 = new String("곰돌이사육사"); // 리터럴 상수가 아니다! 힙 영역에 메모리 잡았다 = 주소가 달라진다

        if (city2 == city) {
            System.out.println("해당 변수들의 주소는 같다");
        } else {
            System.out.println("해당 변수들의 주소는 다르다");
        }

        if (name.equals(addr)) {
            System.out.println("해당 변수들의 내용이 같다");
        } else {
            System.out.println("해당 변수들의 내용이 다르다");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ");
        String season = sc.next();
        // equals() 메서드는 문자열을 비교. == 는 문자열의 주소 값이 같은지 비교'


//        switch (season) {
//            case "spring":
//                System.out.println("한국에서 곧 사라질 봄 날씨가 온다.");
//                break;
//            case "summer":
//                System.out.println("여기가 한국이냐 동남아냐, 여름이 뭐 같구나");
//                break;
//            case "fall":
//            case "autumn":
//                System.out.println("가을도 멸종할 날이 멀지 않았구나");
//                break;
//            case "winter":
//                System.out.println("죽음의 겨울이라지만, 올해는 춥지도 않다는데?");
//                break;
//            default:
//                System.out.println("계절을 쓰랬지 개소리를 쓰라고 안했다.");
//        }

        // 일단 if ~else if~ else 사용시...
//        if (season.equals("spring")) {
//            System.out.println("한국에서 곧 사라질 봄 날씨가 온다.");
//        } else if (season.equals("summer")) {
//            System.out.println("여기가 한국이냐 동남아냐, 여름이 뭐 같구나");
//        } else if (season.equals("autumn")) {
//            System.out.println("가을도 멸종할 날이 멀지 않았구나");
//        } else if (season.equals("winter")) {
//            System.out.println("죽음의 겨울이라지만, 올해는 춥지도 않다는데?");
//        } else {
//            System.out.println("계절을 쓰랬지 개소리를 쓰라고 안했다.");
//        }
    }
}
