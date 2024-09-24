package 상근이알람;

import java.util.Scanner;

public class AlarmEx {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        // 시간 입력:
        // 분 입력:
        // 시간과 분을  분으로 환산
        // 계산된 분이 45분 미만이면 하루의 시간을 더해줌
        // 계산된 시간에서 45분 빼줌
        // 다시 시간과 분으로 환산해서 결과 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("목표 시간을 기입 : ");
        int h = sc.nextInt();
        int m = sc.nextInt();

//        //방법 1:
//        if (m < 45) {
//            if (h == 0) {
//                h = 23;
//                m += 60;
//            } else {
//                h -= 1;
//                m += 60;
//            }
//        }
//        System.out.println("설정한 알람 시간은 : " + h + ":" + (m - 45));
        // 방법 2
        int converted_time = h * 60 + m;
        if (converted_time < 45) {  // 계산된 시간이 45 이하면 하루라는 시간을 더해줘야 전날 계산이 제대로 된다
            converted_time = (24 * 60) + m; // 45보다 작다는 것은 시간을 별도 계산해줘야한다는 것...!
        }
        converted_time -= 45;
        // 자바는 나눠버리면 바로 몫이 나오니까 60분=1시간으로 나눠버리고, 나머지는 % 이용해서 구한다.
        System.out.println("설정한 알람 시간은 " + (converted_time / 60) + ":" + (converted_time % 60));
    }
}
