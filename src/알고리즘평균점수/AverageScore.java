package 알고리즘평균점수;
// 학생 수가 5명; 5명의 성적 입력 받음
// 입력 받은 성적 중, 40점 미만은 40으로 수정해서 적용
// 평균 점수 구하기
// 점수는 모두 0 점 이상, 100점 이하의 5의 배수이다. 평균 점수는 항상 정수이다.

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testScore[] = new int[5];
//        System.out.println("성적 기입 : ");
//        testScore[0] = sc.nextInt();
//        testScore[1] = sc.nextInt();
//        testScore[2] = sc.nextInt();
//        testScore[3] = sc.nextInt();
//        testScore[4] = sc.nextInt();

        int totalScore = 0;
        System.out.println("성적 기입 : ");
        for (int i = 0; i < testScore.length; i++) {
            // 효율적인 코딩을 위해 위에 반복이 아닌 입력을 for문에 내부에 넣어서 처리.
            testScore[i] = sc.nextInt();
            if (testScore[i] < 40) {
                testScore[i] = 40;
            }
            totalScore += testScore[i];
        }
        int avgScore = totalScore / testScore.length;
        System.out.print("평균 성적은 " + avgScore);
    }
}
