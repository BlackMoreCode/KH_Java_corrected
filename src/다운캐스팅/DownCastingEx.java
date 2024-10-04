package 다운캐스팅;

import java.util.ArrayList;
import java.util.List;

// 다운캐스팅: 상윌 클래스형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것.
// 인스턴스 instanceof 클래스: 형 변환 가능 여부를 확인
public class DownCastingEx {
    // <> = generic type
    // Animal 타입의 요소로 이루어진 ArrayList를 선언
    // List는 ArrayList의 부모 같은 셈. List 밑에 ArrayList, Vector, LinkedList 등등...
//    ArrayList<Animal> animals = new ArrayList<>();
    List<Animal> animals = new ArrayList<>();
    //List로 접근하면 부모가 상속 준 것만 접근 가능; 강사님은 List로 접근하는게 더 좋다고 본다.
    //ArrayList로 접근하면
    public static void main(String[] args) {
        DownCastingEx downCast = new DownCastingEx();
        downCast.addAnimal();
        downCast.downCasting();
    }
    public void addAnimal() {
//        Animal animal = new Animal(); // 이거를 축약하면 밑이랑 같다.
        animals.add(new Animal()); //Animal 클래스로 객체 생성; ArrayList의 첫번째 요소로 넣는다 (뭐 보통 add는 마지막에 넣는 것)
        // 다만 지금은 다른게 없으니 첫번째다.
        animals.add(new Tiger());
        animals.add(new Eagle());
        animals.add(new Human());
        for (Animal e: animals) e.move();
    }
    public void downCasting() {
        for (int i = 0; i < animals.size(); i++) {
            Animal ani = animals.get(i); // ArrayList에서 해당 인덱스의 값을 가져온다
            if(ani instanceof Human) {
                Human h = (Human) ani; // 다운캐스팅은 명시적 형변환이 필요하다.
                h.readBook();
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형입니다.");
            }
        }
    }
}
