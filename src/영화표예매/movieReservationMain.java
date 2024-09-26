package 영화표예매;
// 예매하기/종료하기 메뉴 작성
// 총 좌석은 10개
// 좌석당 가격은 12000원; 생성자를 통해서 입력
// 좌석 정보에 대한 메서드 작성 ([][][][][][v][][][])
// 좌석 예약 하기: 값이 0 이면 예약 안된 좌석, 1이면 판매된 좌석
// 총 판매 금액에 대한 메서드 작성

import java.util.Scanner;

public class movieReservationMain {
    public static void main(String[] args) {
        // MovieTicket 클래스에 대한 객체 생성
        // 입력 받기 위한 스캐너 생성
        // 메뉴 작성은 무한 반복문으로 구현하기;
        // 1. 좌석 예약하기 메서드 호출
        // 2. 종료하기 누르면 총 판매 금액 표시하고 종료.
    TicketReservation ticketReservation = new TicketReservation(12000);
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("[1] 좌석 예약");
        System.out.println("[2] 좌석 예약 취소");
        System.out.println("[3] 종료하기");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                ticketReservation.seatPurchase();
                break;
            case 2:
                ticketReservation.seatCancel();
                break;
            case 3:
                System.out.println("총 판매금액은 : " + ticketReservation.totalRevenue());
                return;
            default:
                System.out.println("1,2,3 중 하나를 택하시오.");
        }
        }
    }
}
