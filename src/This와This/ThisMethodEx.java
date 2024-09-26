package This와This;
// this: 자기 자신의 객체를 참조하는 변수
// this() 메서드 : 다른 생성자 호출 할 때 사용
public class ThisMethodEx {
    public static void main(String[] args) {
        Car car = new Car();
    }
}

class Car {
    private String name;
    private int year;
    private String color;
    private int speed;

    public Car(String name, int year, String color, int speed) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.speed = speed;
    }

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public Car() {
        this("싼타페", 2024, "Gray"); // this() 메서드는 잘 안쓴다.
    }
}