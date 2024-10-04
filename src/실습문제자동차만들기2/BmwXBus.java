package 실습문제자동차만들기2;

public class BmwXBus extends BmwXCar{
    int fuelEconomy = 5;
    double speed = 150;
    int fuelTankSize = 100;
    int seatNumber = 20;

    public BmwXBus(String name) {
        super(name);
    }

    @Override
    double totalPrice(int nop, int area, int add_Ons) {
        double tp = 0;
        double cnt = Math.ceil((double) nop / seatNumber);
        if (nop < seatNumber) cnt = 1;
        tp = cnt * DESTINATION_LIST[area] / fuelEconomy * oneLOil;
        return Math.floor(tp);
    }

    @Override
    double totalOilCnt(int nop, int area, int add_Ons) {
        double to = 0;
        double cnt = Math.ceil((double) nop / seatNumber);
        if (nop < seatNumber) cnt = 1;
        if (ADD_ONS[add_Ons] == 1) {
            to = cnt * DESTINATION_LIST[area] / (fuelEconomy * (fuelTankSize + 30));
        } else to = cnt * DESTINATION_LIST[area] / (fuelEconomy * fuelTankSize);
        return Math.ceil(to);
    }

    @Override
    double totalDistanceTime(int nop, int area, int weather, int add_Ons) {
        double tdt = 0;
        double cnt = Math.ceil((double) nop / seatNumber);
        if (nop < seatNumber) cnt = 1;
        tdt = cnt * DESTINATION_LIST[area] / speed;
        if(weather == 2 || weather == 3) tdt *= WEATHER[weather];
        return tdt*60 ;
    }
}