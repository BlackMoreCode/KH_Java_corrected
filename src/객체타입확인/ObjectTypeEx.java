package 객체타입확인;
// 객체 타입 확인 : instanceof
// 반환값(true/false) = 좌항 (객체) instanceof 우항(클래스)
// 객체가 특정 클래스의 인스턴스인지를 확인하기 위해서 사용



public class ObjectTypeEx {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent); // True
        System.out.println(child instanceof Parent); // True, 상속 관계가 존재하기 때문에 성립
        System.out.println(parent instanceof Child); // false 상속관계 역은 성립불가.
        System.out.println(child instanceof Child); // True
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent{

    public Child(String name) {
        super(name);
    }
}