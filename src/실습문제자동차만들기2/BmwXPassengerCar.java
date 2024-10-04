package 실습문제자동차만들기2;

public class BmwXPassengerCar extends BmwXCar{
    int fuelEconomy = 12;
    int speed = 200;
    int fuelTankSize = 45;
    int seatNumber = 4;

    public BmwXPassengerCar(String name) {
        super(name);
    }

    @Override
    double totalPrice(int nop, int area, int add_Ons) {
        double tp = 0;
        if(ADD_ONS[add_Ons] == 1) seatNumber += 1;
        double cnt = Math.ceil((double) nop / seatNumber);
        if (nop < seatNumber) cnt = 1;
        tp = cnt * DESTINATION_LIST[area] / fuelEconomy * oneLOil;
        return Math.floor(tp);
    }


    @Override
    double totalOilCnt(int nop, int area, int add_Ons) {
        seatNumber = 4;
        if (ADD_ONS[add_Ons] == 1) {seatNumber += 1;}
        double cnt = Math.ceil((double) nop / (double) (seatNumber));
        if (nop < seatNumber + 1) cnt = 1;
        double to = cnt * (double) DESTINATION_LIST[area] / (double) (fuelEconomy * fuelTankSize);
        return Math.ceil(to);
    }


    @Override
    double totalDistanceTime(int nop, int area, int weather, int add_Ons) {
        seatNumber = 4;
        double tdt = 0;
        if (ADD_ONS[add_Ons] == 1) {seatNumber += 1;}
        double cnt = Math.ceil((double) nop / seatNumber);
        if (nop < seatNumber) cnt = 1;
        tdt = cnt * DESTINATION_LIST[area] / speed;
        if (weather == 2 || weather == 3) tdt *= WEATHER[weather];
        return tdt * 60;
    }
}

