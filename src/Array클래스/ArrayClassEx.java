package Array클래스;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayClassEx {
    public static void main(String[] args) {
//        sortAndSearchFunc();
        sortComparatorFunc();

        Integer[] array = {5, 4, 7, 9, 13, 3, 1, 88, 23};
        List<Integer> list = Arrays.asList(array); // 배열을 리스트로 변환 시도 하는 매서드

    }
    // 정렬과 검색
    static void sortAndSearchFunc() {
        Integer[] array = {5, 4, 7, 9, 13, 3, 1, 88, 23};
//        Arrays.sort(array); // 해당 값을 오름차 순으로 정렬
        Arrays.sort(array, Collections.reverseOrder());
        for (int e : array) System.out.println(e + " ");
        System.out.println();
        // binary search
        System.out.println("결과에 대한 인덱스 : " + Arrays.binarySearch(array, 88)); //
    }

    // 정렬 오버라이딩: 상속 받은 메서드를 재정의 하는 것
    // e.g. 과일 이름을 정렬하는데 길이가 짧은 순으로 정렬하고, 길이가 같은 경우 사전 정렬 해주세요.
    // 이 경우 기존에 있는 정렬 조건으로 안될 테니 직접 재정의해서 해줘야한다.
    // Comparator 클래스의 compare메서드를 오버라이딩해서 정렬 조건을 만듬.
    static void sortComparatorFunc() {
        Integer[] array = {5, 4, 7, 9, 13, 3, 1, 88, 23};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) return 1;  //양수를 반환하면 정렬 조건; 이 경우 뒷 값이 클 경우 앞의 값이 앞으로,
                return -1;
            }
        });

        for(int e : array) System.out.println(e +" ");
    }

}
