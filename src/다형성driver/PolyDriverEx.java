package 다형성driver;

import java.util.Scanner;

public class PolyDriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver("곰돌이사육사");
        Scanner sc = new Scanner(System.in);
        System.out.println("운전하고 싶은 차를 선택 [1]스포츠카 [2]버스 [3]택시");
        int sel = sc.nextInt();
        switch (sel) {
            case 1: driver.drive(new SportsCar()); break;
            case 2: driver.drive(new Bus()); break;
            case 3: driver.drive(new Taxi()); break;
            default: System.out.println("선택한 차량이 존재하지 않습니다.");
        }
    }
}

class Driver {
    String name;
    Driver(String name) {
        this.name = name;
    }
    void drive(Vehicle v) { // class + instance 매개변수가 들어온다. 오버라이딩 구현 예시
        System.out.print(name + "의 ");
        v.run();
    }
}

class Vehicle {
    void run() {
        System.out.println("탈 것이 달린다.");
    }
}

class SportsCar extends Vehicle {
    @Override
    void run() {
        System.out.println("스포츠카가 달린다.");
    }
}

class Bus extends Vehicle {
    @Override
    void run() {
        System.out.println("버스가 달린다.");
    }
}

class Taxi extends Vehicle {
    @Override
    void run() {
        System.out.println("택시가 달린다.");
    }
}