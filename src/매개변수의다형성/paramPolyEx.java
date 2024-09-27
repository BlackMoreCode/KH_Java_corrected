package 매개변수의다형성;
// 상속 관계를 이용해서 매개변수의 자식 타입의 객체를 대입
// 부모클래스의 참조 변수 복습 필요

public class paramPolyEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new PlayStation());
        buyer.buy(new TV()); // 이것은 TV 클래스의 tv 인스턴스를 만든 이후 buyer.buy(tv) 와 같다.
        buyer.buy(new Computer());
        buyer.viewInfo();

    }
}

class Product {
    int price;
    int bonusPoint;
}

class TV extends Product {
    public TV() {
        this.price = 1000;
        this.bonusPoint = 10;
    }
}

class Computer extends Product {
    public Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}

class PlayStation extends Product {
    public PlayStation() {
        this.price = 120;
        this.bonusPoint = 12;
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) { // 여기서 p 는 Product 클래스의 참조 변수이다.
        money -= p.price; // 제품 구매시 소지금에서 빠지고
        bonusPoint += p.bonusPoint; //그러면 보너스 포인트가 쌓인다
    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}