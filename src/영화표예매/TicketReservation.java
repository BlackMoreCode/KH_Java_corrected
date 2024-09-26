package 영화표예매;
import java.util.Scanner;

public class TicketReservation {
    // 좌석 10개에 대한 정수형 배열의 인스턴스 변수 생성
    // 좌석당 가격에 대한 인스턴스 필드
    // 생성자는 좌석당 가격 정보를 객체 생성시 넣어야 되므로 매개변수가 있는 생성자 필요

    // 좌석 상태 표시 메서드 구현

    // 좌석 예약 메서드 구현

    // 총 판매금액 메서드 구현 (총 판매 금액은 인스턴스 필드로 만들지 말고 결과로 반환)

    private final int[] seat = new int[10];
    private final int price;
    private final Scanner sc = new Scanner(System.in);

//    public TicketReservation() {
//        price = 12000;
//    }

    public TicketReservation(int price) {
        this.price = price;
    }

    //좌석 상태 표시 메서드
    public void seatStatus() {
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] == 0) System.out.print("[ ]");
            else System.out.print("[v]");
        }
    }

    public void seatPurchase() {
        seatStatus(); // 현재 좌석 상태 메서드를 호출한다
        System.out.print("예약하고자 하는 좌석 넘버를 입력하세요 : ");
        int seatNum = sc.nextInt();
        if (seat[seatNum - 1] == 0) { // 좌석이 비어있을 시
            seat[seatNum - 1] = 1; // 좌석을 예약해주고
            seatStatus(); // 좌석 상태 메서드를 호출해서 확정짓는다.
        } else System.out.println("이 좌석은 예약되어있습니다");
        System.out.println();
    }

    public void seatCancel() {
        seatStatus();
        Scanner sc = new Scanner(System.in);
        System.out.println("예약 취소하고자 하는 좌석 넘버를 입력하세요 : ");
        int seatNum = sc.nextInt();
        if (seat[seatNum - 1] == 1) { // 좌석이 예약된 것이 확인된다면
            seat[seatNum - 1] = 0; // 좌석 예약을 취소해주고
            seatStatus(); // 좌석 상태 메서드를 호출해서 확정짓는다.
        } else System.out.println("이 좌석은 예약되어 있지 않습니다");
        System.out.println();
    }

    //총 판매급액 메서드
    public int totalRevenue() {
        int cnt = 0;
        for (int el : seat) {
            if (el == 1) cnt++;
        }
        return cnt * 12000;
    }
}
