package 트리셋;
// 트리셋 : 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장
// 중복을 허용하지 않는다; 순서는 정렬된 형태로 유지
// 삽입, 삭제, 검색 시 시간복잡도 => O(log n);
// 요소가 정렬된 상태로 유지 되어야할 때 사용
// 특정 기준으로 정렬을 해야하는 경우 Comparable / Comparator 인터페이스를 상속 받아서 구현

import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);

        for(Integer e : ts) System.out.print(e + " ");
    }
}
