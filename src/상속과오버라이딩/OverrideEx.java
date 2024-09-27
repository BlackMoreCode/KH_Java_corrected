package 상속과오버라이딩;
// final 키워드: 클래스, 필드, 메서드 선언시 사용 할 수 있음
// 메서드에 사용하는 경우, 상속하면 오버라이딩을 금지할 수 있다
// 변경되면 위험할거 같다? 그러면 적용하고 본다. 가능하면 많이 사용한다.


public class OverrideEx {
    public static void main(String[] args) {

    }
}

class Car {
    int speed;
    String name;
    String color;
    final void accelerator() {
        System.out.println("밟으면 차의 속도가 증가");
    }
    final void breakPanel() {
        System.out.println("밟으면 차의 속도가 감소");
    }
}

class SportsCar extends Car {
    boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        color = "red";
    }

    int getSpeed() {
        if (isTurbo) return speed *= 1.2;
        return speed;
    }

    public void setTurbo (boolean isTurbo) {
        this.isTurbo = isTurbo;
    }

    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println();
    }
}