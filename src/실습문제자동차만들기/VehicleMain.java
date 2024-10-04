package 실습문제자동차만들기;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이동에 사용할 차량을 선택하세요 : [1]스포츠카 [2]승용차 [3]버스 : ");
        int sel_vehicle = sc.nextInt();

        switch (sel_vehicle) {
            case 1:
                SportsCar sportsCar = new SportsCar("Ferrari", 8, 2, 250, 30);
                sportsCar.drive();
                break;
            case 2:
                PassengerCar passengerCar = new PassengerCar("GV80", 12, 4, 200, 45);
                passengerCar.drive();
                break;
            case 3:
                Bus bus = new Bus("관광버스", 5, 20, 150, 100);
                bus.drive();
                break;
            default: System.out.println("정보를 잘못 기입하셨습니다.");
        }

    }
}
