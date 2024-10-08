package 실습문제자동차만들기;

public abstract class Vehicle {
    public String vehicleType;
    public final int FUEL_PRICE = 2000;
    public final int[] DESTINATION_DIST = {0, 400, 150, 200, 300};
//    public final int DIST_BUSAN_KM = 400;
//    public final int DIST_KL_KM = 200;
//    public final int DIST_DJ_KM = 150;
//    public final int DIST_GJ_KM = 300;
    public int mileage;
    public int seat;
    public int speed;
    public int fuelTank;

    public Vehicle (String vehicleType, int mileage, int seat, int speed, int fuelTank) {
        this.vehicleType = vehicleType;
        this.mileage = mileage;
        this.seat = seat;
        this.speed = speed;
        this.fuelTank = fuelTank;
    }

    abstract void drive();
}
