package 배열정렬;
// 정렬 알고리즘 구현 해보기: 버블 정렬 O(n2), 삽입 정렬 O(n2), 병합 정렬 O(nlogn), 퀵 정렬 O(nlogn)

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 10, 5, 8, 7, 6};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for (int e : arr) System.out.print(e + " ");

    }
}
