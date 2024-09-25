package 이차원배열;

public class DoubleArrEx {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = cnt++;
            }
        }
        // 향상된 for문 이용시
        for (int[] ee : arr) {
            for (int e : ee) {
                System.out.println(e + " ");
            }

            String[] strArr = {"Java", "Python", "C++", "C", "Kotlin"};

            for (String e: strArr) {
                System.out.print(e.charAt(0));
            }


            System.out.println();
        }
    }
}
