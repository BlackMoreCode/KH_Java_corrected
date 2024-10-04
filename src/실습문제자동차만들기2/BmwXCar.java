package 실습문제자동차만들기2;

// int totalPrice; 총비용
// int totalDistanceTime; 총이동시간
// int totalOillCnt; 총주유횟수
// int nop; 총 탑승 인원 : Number Of Passenger
// int area; 목적지
// String carName; // 차량 명
// int fuelEconomy; // 차량 연비
// int speed; // 차량 속도
// int fuelTankSize; // 차량 연료 탱크 크기
// int seatNumber; // 차량 좌석수

public abstract class BmwXCar {
    String name;
    //부산,대전,강릉,광주
    int[] DESTINATION_LIST = {0, 400, 150, 200, 300};
    double[] WEATHER = {0, 0, 1.2, 1.4};
    int[] ADD_ONS = {0, 1 ,2};
    int oneLOil = 2000; // 기름 1L 당 금액
    public BmwXCar(String name) {
        this.name = name;
    }
    abstract double totalPrice(int nop, int area, int add_Ons);  // 총 비용
    abstract double totalOilCnt(int nop, int area, int add_Ons); // 총 주유 횟수
    abstract double totalDistanceTime(int nop, int area, int weather, int add_Ons); // 총 이동 시간

}
