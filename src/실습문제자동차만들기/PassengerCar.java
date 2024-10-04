package 실습문제자동차만들기;

import java.util.Scanner;

public class PassengerCar extends Vehicle{
    public PassengerCar(String vehicleType, int mileage, int seat, double speed, int fuelTank) {
        super(vehicleType, 12, 4, 200, 45);
    }

    @Override
    void drive() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이동할 지역을 선택하세요 : [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int sel_location = sc.nextInt();
        double distance = DESTINATION_DIST[sel_location]; // 선택된 목적지의 거리
        double fuelConsumption = distance / mileage; // 1번 편도당 소모되는 연료 양
        //디버깅용 로그 따기. 추후에 지워야함.
        System.out.println(distance + "에 가는데, 1회 기준으로 걸리는 연료 양은 " + fuelConsumption);

        System.out.println("부가기능을 켜겠습니까? : [1]yes [2]no ");
        int sel_option = sc.nextInt();
        if (sel_option == 1) {
            seat += 1;
        }

        System.out.println("날씨 설정 : [1]맑음 [2]비 [3]눈 ");
        int sel_weather = sc.nextInt();
        double weather_factor = 0;
        switch (sel_weather){
            case 1:
                weather_factor = 1;
                break;
            case 2:
                weather_factor = 1.2;
                break;
            case 3:
                weather_factor = 1.4;
                break;
            default:
                System.out.println("숫자가 맞지 않습니다");
        }

        System.out.println("탑승할 인원을 기입해주세요 :  ");
        int sel_passenger_num = sc.nextInt();
        // 인원을 넘길 시 한번 더 가야한다.. 옵션을 키면 인원 제한이 4명에서 5명으로 늘어난다.
        if (sel_option != 1) {
            // 만약 sel_passenger_num 가 4의 배수가 아니라면
            if (sel_passenger_num % 4 != 0) {
                // 다음 4의 배수로 맞춰줘라!
                sel_passenger_num += (4 - (sel_passenger_num % 4));
            }
        } else if (sel_option == 1) {
            // 추가 옵션을 켰고, sel_passenger_num 이 5의 배수가 아니라면
            if (sel_passenger_num % 5 != 0) {
                // 다음 5의 배수로 맞춰줘라.
                sel_passenger_num += (5 - (sel_passenger_num % 5));
            }
        }

        // 총 주유횟수 = (인원수 / 해당 차량의 태울 수 있는 최대수) * 거리 / (연비 * 연료탱크); Math.ceil 소숫점 올려버림
        double count = Math.ceil((double)(sel_passenger_num / seat) * distance / (mileage * fuelTank));

        double totalFuelCost = Math.ceil((double)(sel_passenger_num / seat) * distance / mileage);
        double totalCost = totalFuelCost * FUEL_PRICE;

        double hour = weather_factor * ((distance * (double)(sel_passenger_num / seat)) / speed);
        double minute = hour * 60;
        double adjusted_hour = minute / 60;
        int intAdjustedValue = (int)adjusted_hour;
        double adjusted_min = minute % 60;

        System.out.println("====" + vehicleType + "====");
        System.out.println("총 탑승 인원 : " + sel_passenger_num);
        System.out.println("총 비용은 : " + totalCost);
        System.out.println("총 주유 횟수는 : " + count);
        System.out.println("총 이동 시간은 : " + intAdjustedValue + "시간 " + adjusted_min + "분입니다.");
    }
}
