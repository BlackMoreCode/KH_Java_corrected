package 실습문제자동차만들기2;

import java.util.Scanner;

public class MakeACarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BmwXSportsCar bmwXSportsCar = new BmwXSportsCar("X2");
        BmwXPassengerCar bmwXPassengerCar = new BmwXPassengerCar("X4");
        BmwXBus bmwXBus = new BmwXBus("X6");

        do {

            System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            int area = sc.nextInt();
            System.out.print("이동 할 승객 수 입력 : ");
            int nop = sc.nextInt();
            System.out.print("이동 할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            int carType = sc.nextInt();
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            int add_Ons = sc.nextInt();
            System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
            int weather = sc.nextInt();
            System.out.println();

            if (area >= 1 && area <= 4 && nop > 0 && nop < 100 && carType >= 1 && carType <= 3 && add_Ons >= 1 && add_Ons <= 2 && weather >= 1 && weather <= 3) {
                if (carType == 1) {
                    System.out.println("========== " + bmwXSportsCar.name + " ==========");
                    System.out.println("총 비용 : " + (long) bmwXSportsCar.totalPrice(nop, area, add_Ons) + "원");
                    System.out.println("총 주유 횟수 : " + (long) bmwXSportsCar.totalOilCnt(nop, area, add_Ons) + "회");
                    System.out.println("총 이동 시간 : " + (long) (bmwXSportsCar.totalDistanceTime(nop, area, weather, add_Ons) / 60) + "시간" + (long) (bmwXSportsCar.totalDistanceTime(nop, area, weather, add_Ons) % 60) + "분");
                }
                if (carType == 2) {
                    System.out.println("========== " + bmwXPassengerCar.name + " ==========");
                    System.out.println("총 비용 : " + (long) bmwXPassengerCar.totalPrice(nop, area, add_Ons) + "원");
                    System.out.println("총 주유 횟수 : " + (long) bmwXPassengerCar.totalOilCnt(nop, area, add_Ons) + "회");
                    System.out.println("총 이동 시간 : " + (long) (bmwXPassengerCar.totalDistanceTime(nop, area, weather, add_Ons) / 60) + "시간" + (long) (bmwXPassengerCar.totalDistanceTime(nop, area, weather, add_Ons) % 60) + "분");
                }
                if (carType == 3) {
                    System.out.println("========== " + bmwXBus.name + " ==========");
                    System.out.println("총 비용 : " + (long) bmwXBus.totalPrice(nop, area, add_Ons) + "원");
                    System.out.println("총 주유 횟수 : " + (long) bmwXBus.totalOilCnt(nop, area, add_Ons) + "회");
                    System.out.println("총 이동 시간 : " + (long) (bmwXBus.totalDistanceTime(nop, area, weather, add_Ons) / 60) + "시간" + (long) (bmwXBus.totalDistanceTime(nop, area, weather, add_Ons) % 60) + "분");
                }break;
            } else {
                if (area < 1 || area > 4) System.out.println("이동 지역을 잘못입력하셨습니다.");
                else if (nop < 0 || nop > 100) System.out.println("이동 승객 수를 잘못입력하셨습니다.");
                else if (carType < 1 || carType > 3) System.out.println("이동 차량 선택을 잘못입력하셨습니다.");
                else if (add_Ons < 1 || add_Ons > 2) System.out.println("부가 기능 선택을 잘못입력하셨습니다.");
                else if (weather < 1 || weather > 3) System.out.println("날씨 선택을 잘못입력하셨습니다.");
            }
            System.out.println("=========================");
        } while (true);
    }
}
