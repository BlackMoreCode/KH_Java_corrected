package 얕은복사깊은복사;
//

public class CopyTypeEx {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = arr1;

        // 지금 이 나열한 순서들을 반대로 하면 (arr1 하고 2) 밑에서 for문 돌릴때 1, 1, 1 이 나올 것이다.
        arr1[0] = 1;
        arr1[1] = 1;
        arr1[2] = 1;

        arr2[0] = 1000;
        arr2[1] = 2000;
        arr2[2] = 3000;

        int cnt = 100;
        // 현재 이걸 향상된 for문에서 arr2 요소값 (1000, 2000, 3000) 이 나오는 이유는 얕은 복사가 이루어져서
        // arr1은 arr2의 주소값을 참조하고 있기 때문이다!
        for(int e : arr1) System.out.print(e + " ");

    }
}
