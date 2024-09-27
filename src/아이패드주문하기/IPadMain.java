package 아이패드주문하기;

import java.util.Scanner;

public class IPadMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            IPadPro iPadPro = new IPadPro("iPad Pro");
            if (!iPadPro.continueOrder()) break;
            System.out.println("[1] 제품 구매");
            System.out.println("[2] 종료");
            int menu = sc.nextInt();
            if (menu == 1) {
                iPadPro.setColor();
                iPadPro.setMemory();
                iPadPro.setScreen();
                iPadPro.setNetwork();
                iPadPro.setName();
                iPadPro.setSerialNum();
                iPadPro.IPadProPriceCalc();
                iPadPro.progressIPadPro();
                iPadPro.IPadProInfo();
            } else return;
        }
    }
}
