package 정적메서드은행예제;
// static 멤버와 메서드는 클래스 생성 시 함께 생성되고, 객체가 생성 시 만들어 지지 않는다.
// 하나의 클래스에서 한개만 존재
// 한번 생성되면 프로그램 종료 시 까지 사라지지 않는다.
// 정적(static) 메서드에서는 인스턴스 필드나 메서드를 사용할 수 없다.

public class StaticBankMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 500);
        kakao.setDeposit(3000);
        kakao.setWithdraw(2000);
        System.out.println(kakao.getBank() + "에 " + kakao.getAccount() + "이 있습니다");
        System.out.println("계좌가 " + Bank.getCount() + "개가 개설 되었습니다");

        System.out.println(Util.max(100, 200));
        System.out.println(Util.isEven(123));
        System.out.println(Util.getCurrentDate("20240930"));
    }
}
