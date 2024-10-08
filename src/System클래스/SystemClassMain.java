package System클래스;

import static java.lang.Thread.sleep;

// System 클래스 : 표준 입출력 관련, 시스템 정보 관련 메서드 제공
public class SystemClassMain {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0, i;
        int randVal = (int)(Math.random() * 1000) + 1; // 1~1000 사이 임의의 값
        for (i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        // 1970년 1월 10일 0시 0분부터 경과시간을 밀리세컨 단위로 기록
        long start = System.currentTimeMillis();
        for (i =0; i < data.length; i++) {
            cnt++;
            sleep(1);
            if (randVal == data[i]) {
                System.out.println("위치 : " + (i + 1));
                break;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("총 검색횟수 : "+ cnt);
        System.out.println("검색에 소요된 시간 : " + (end - start) + "일초 일단위");
    }
}
