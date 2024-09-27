package 상속기본;
// 자식 클래스가 부모 클래스의 기능을 그대로 물려 받는 것
// 상속 받은 자식 클래스는 부모 클래스와 같거나 커야한다.
// 부모 클래스가 먼저 생성되고 자식 클래스가 생성. 소멸시에는 자식 클래스가 먼저 사라진다.
// 사용하는 이유는 재사용성, 다형성(=오버라이딩; 상속 받은 이름을 재정의)
// 자바는 다중 상속을 지원하지 않음 (다중 상속과 유사한 기능을 제공하기 위해서 인터페이스가 존재)
// 키워드는 extends
// 상속을 받지 않는 클래스는 기본적으로 Object 클래스로부터 상속을 받음
// 오버라이딩은 부모가 물려준 기능을 재정의 하는 것 (재정의 하지 않을 시 부모의 메서드가 호출 됨)

public class InheritanceBasicEx {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setName("댕댕이");
//        System.out.println(dog.getName());
        HouseDog houseDog = new HouseDog();
        houseDog.setName("댕댕이");
        houseDog.sleep(4);
    }
}

// 원래 클리스들은 기본적으로 Object를 상속하기에 이렇게 쓸 필요는 없다
class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(name + " zzz");
    }
}

class HouseDog extends Dog {
    @Override // annotation / 어노테이션; 문법적으로 오바라이딩이 성립하는지 체크
    // 오버라이딩 관계가 성립하려면 메서드도 이름과 반환타입도 같아야 한다.
    public void sleep() {
        System.out.println(name + " zzz in house");
    }

    // 오버라이딩 이후 오버 로딩
    void sleep(int hour) {
        System.out.println(name + "zzz in house for " + hour);
    }
}