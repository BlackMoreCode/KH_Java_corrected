package 제네릭기본;
// 제네릭이란? 데이터 타입을 일반화 한다는 의미;
// 데이터 타입 또는 자료 구조에 상관 없이 동일한 프로그래밍 기능
// 클래스나 메서드에서 사용할 내부 데이터 타입을 컴파일 시 미리 지정하는 방식 사용

import java.util.ArrayList;
import java.util.List;

public class GenericBasicMain {
    public static void main(String[] args) {
        genericTypeVarFunc();
    }
    // 제네릭 타입 제한 : 컴파일 시 타입 체크 가능, 타입 변환 제거.
    static void genericBasicFunc() {
        List<String> list = new ArrayList<>();  //<> 에서 뭘 받을지 지정한다.
        list.add("100");    //위에서 지정했으므로 여기에 숫자 100을 쓰면 에러가 터지고, 문자열 100으로 써야한다.
        System.out.println((String) list.get(0));
    }
    static void genericTypeVarFunc() {
        Person<String> p1 = new Person("NANI");
        Person<Integer> p2 = new Person(1004);
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
    }
}

class Person<T> {   // 대문자 T는 관례적으로 타입 변수를 의미. 제네릭 타입이라고 보여준다.
    private T info;
    Person(T info) {
        this.info = info;
    }
    public T getInfo() {
        return info;
    }
}