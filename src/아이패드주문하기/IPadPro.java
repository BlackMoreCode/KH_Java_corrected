package 아이패드주문하기;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;
import static 아이패드주문하기.Common.*;

public class IPadPro {
    private Scanner sc; // 입력을 받기 위한 스캐너 참조 변수
    private int screen; // 11인치 / 13인치 일지 정하기 위한 변수 선언
    private int color; // 스페이스 그레이 / 실버
    private int memory; // 256 / 512 GB, 1 / 2TB 메모리 사이즈를 정해줄 변수 선언
    private int network; // cellular 일지 wifi 일지 정하기 위한 변수 선언
    private String name; // 각인 서비스 이름 저장
    private String productDate; // 제품 생산 일자
    String serialNum; // 제품에 대한 일련번호
    private static int cnt = 0; // 제품 생산 갯수 트래커; 0에서 부터 시작. 클래스 변수이다.
    private int price; // 제품 구매 가격

    public IPadPro(String name) { // 생성자는 클래스가 객체로 만들 때 호출
        this.sc = new Scanner(System.in);
        this.name = name; // 생성자 호출시 이름을 전달 받아서 초기값을 지정.
        Date now = new Date(); // 현재 시간을 운영체제로부터 받아옴
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); // 날짜 지정해주는 방식
        productDate = sdf.format(now); // 지정된 format 형태로 시간정보가 가공되서 반환
        cnt++;
        productDate += cnt; //이 경우는 산술 연산이 아니라 문자열을 연결한다. 시리얼 넘버 제작용도.
    }

    public boolean continueOrder() {
        System.out.println("====== iPad Pro 구입하기 ======");
        System.out.println("구입 진행하려면 yes, 종료시 no를 입력해주세요 : ");
        String isContinue = sc.next();
        if (isContinue.equalsIgnoreCase("yes")) return true;
        else return false;
    }

    public void setScreen() {
        while (true) {
            System.out.print("디스플레이 선택; [1] 11인치 [2] 13인치 ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            System.out.print("잘못 선택하였습니다. 다시 입력하십시오");
        }
    }

    public void setColor() {
        while (true) {
            System.out.print("컬러 선택; [1] 스페이스 그레이 [2] 실버 ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.print("잘못 선택하였습니다. 다시 입력하십시오");
        }
    }

    public void setMemory() {
        while (true) {
            System.out.print("메모리 용량 선택; [1] 256GB [2] 512GB [3] 1TB [4] 2TB ");
            memory = sc.nextInt();
            if (memory == 1 || memory == 2 || memory == 3 || memory == 4) return;
            System.out.print("잘못 선택하였습니다. 다시 입력하십시오");
        }
    }

    public void setNetwork() {
        while (true) {
            System.out.print("네트워크 선택; [1] Wifi [2] Wifi + Cellular ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.print("잘못 선택하였습니다. 다시 입력하십시오");
        }
    }

    public void setName() {
        while (true) {
            System.out.print("각인 서비스를 위한 이름을 입력하세요 : ");
            name = sc.next();
            if (!name.isEmpty()) { // 이름이 비어있다면 문제다
                return; // 비지 않았다면 제대로 입력한 것
            }
            System.out.print("이름을 다시 입력해주세요"); // 비었다 = 에러, 즉 이 문장을 출력하고 다시 입력 요구.
        }
    }

    // 일련 번호 만들기
    public void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memoryStr = {"", "256", "512", "1024", "2048"};
        String networkStr = (network == 1) ? "W" : "C";
        serialNum = "iPadPro" + screenStr + memoryStr[memory] + networkStr + productDate;
    }

    // 제품 선택 완료이후 출고까지 30초 걸리는 것을 바로 표시
    void progressIPadPro() throws InterruptedException {
        int cnt = 0;
        while (true) {
            sleep(300); // 0.3초를 의미
            cnt++;
            System.out.printf("<< iPadPro 제작중 : [%d%%] >>\r", cnt);
            if (cnt >= 100) break;
        }
    }
    //제품의 선택 옵션, 일련번호, 총 가격 표시
    public void IPadProInfo() {

        System.out.println(" ====== 선택하신 제품의 옵션은 이하와 같습니다 : ======");
        System.out.println("스크린 크기 : " + screenType[screen]);
        System.out.println("색상 : " + colorType[color]);
        System.out.println("메모리 크기 : " + memoryType[memory]);
        System.out.println("각인한 이름 : " + name);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("네트워크 : " + networkType[network]);
        System.out.println("총 가격 : " + price + "원");
        System.out.println(" ====== iPadPro가 출고 되었습니다 ======");
    }

    // 선택한 옵션을 포함한 제품 가격 구하는 함수
    public String IPadProPriceCalc() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        int[] screenPrice = {0, 1499000, 1999000};
        int[] networkPrice = {0, 0, 300000};
        int[] memoryPrice = {0, 0, 300000, 900000, 1500000};
        price = screenPrice[screen] + memoryPrice[memory] + networkPrice[network];
        return numberFormat.format(price);
    }
}
