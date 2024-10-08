package 배열;
//자바에서의 배열은 동일한 데이터 요소가 연속적으로 저장되는 자료 구조
// int[] arr = new int[4]; 크기 잡기.
// 자바는 new를 이용해서 힙 영역에 메모리가 동적 할당되고, 크기를 지정해야 한다.
// 배열의 개선된 형태는 List(Array List, Vector, Linked List) 가 있음
// 배열이나 리스트의 형태는 시퀀스형 자료구조이므로 인덱스로 값을 접근해야한다.


public class ArrayEx {
    public static void main(String[] args) {
        int[] score = new int[3]; //길이가 3인 int형 배열 생성

        score[0] = 78;
        score[1] = 80;
        score[2] = 90;

        // 범위 기간 for 문; 이 방식은 배열의 내용을 변경 가능; 범위를 지정해서 순회 가능
        for(int i = 0; i < score.length; i++) {
            score[i] = score[i] + 10;
            System.out.print(score[i] + " ");
        }
        System.out.println();

        // 향상된 for 문 사용; 배열의 내용을 변경 불가; 무조건 전체 순회 해야한다.
        // 값을 소비하는 주체와 모으는 주체가 다른게 좋다. 빅 데이터에서 자료 모으는 측과 소비하는 측이 다르는게 좋다.
        for(int e: score) {
            e = e + 10;
            System.out.print(e + " ");
        }

        // 위에서 마치 10 추가한 것 처럼 보이지만 실제로 다시 출력해보면 적용이 안된 것이 보인다.
        System.out.println();
        for(int e: score) {
            System.out.print(e + " ");
        }
    }

    // 배열의 선언하는 여러가지 방법. 맨 위 2가지가 주로 쓸 방법
    static void arrayDefine() {
        int[] score1 = new int[4]; // Heap 영역에 메모리 공간을 확보. 동작중에 크기를 지정해줄 수 있다!
        int[] score2 = {88, 99, 43}; // 컴파일러가 크기를 알 수 있으므로 크기 지정이 필요 없음.
        int[] score3;
        score3 = new int[3];
        int[] score4;
        score4 = new int[]{34, 55, 66}; // 좋은 방법은 아니다. scope2랑의 차이는 heap영역에 메모리를 확보하는가 아닌가 정도.
    }
}
