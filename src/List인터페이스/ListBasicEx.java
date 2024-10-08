package List인터페이스;
// List 인터페이스는 ArrayList, Vector, Linked List에 상속을 주기 위한 인터페이스.
// List는 배열과 비슷한 형태의 자료 구조 (인덱스 기반)
// 요소의 저장 순서가 유지 됨
// 같은 요소의 중복 저장을 허용한다 (MAP 과의 차이점 중 하나)
// 데이터 크기가 고정되어 있지 않다
// 데이터를 다루기 위한 메서드 제공
// List 인터페이스의 구현체인 ArrayList Vector, Linked List의 사용 방법이 동일

import java.util.*;

public class ListBasicEx {
    public static void main(String[] args) {
        //List 인터페이스의 참조 변수로 ArrayList로 생성된 객체를 참조 함. Wrapper 클래스 이용해서 리스트 뒤에 작성.
        String[] fruitsArr = {"Watermelon", "Peach", "Cherry"};
        // Arrays.asList : 배열을 리스트로 변환하는 메서드
        List<String> fruits = new ArrayList<>(Arrays.asList(fruitsArr));

        // 요소 추가, 리스트의 맨 뒤에 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // 특정 인덱스에 요소 추가
        fruits.add(1, "Grape");

        // 리스트 출력, toString() 메서드가 오버라이딩 되어 있음
        System.out.println("과일 목록 : " + fruits);

        // 요소 가져오기 (인덱스 접근)
        System.out.println("과일 요소 : " + fruits.get(2));

        // 요소 제거
        fruits.remove(2);

        // 제거 후 인덱스 다시 찍어보기
        System.out.println("과일 목록 : " + fruits);

        // List 사이즈 확인
        System.out.println("과일 목록 사이즈 : " + fruits.size());

        // 요소 순회하기
        for(String e : fruits) {
            System.out.print(e + " ");
        }

        // 리스트 정렬하기
        fruits.sort(Comparator.naturalOrder()); // 기본적으로 오름차순; 사전정렬만 적용된 상태. 길이 정렬은 안했음.
        System.out.println("정렬된 과일 목록 : " + fruits);

        // 반대로 정렬한다면...(내림차순) 혹은 그냥 reverseOrder() 쓰거나.

        //다만 밑의 예시는 길이까지 차순을 먹였다! grape가 그래서 banana 보다 먼저 오게된 것.
        fruits.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;    // 1이 반환되면 바꾸어 달라는 이야기.
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }
                    return -1;
                }
            }
        });

        System.out.println("역으로 정렬된 과일 목록 : " + fruits);

    }
}
