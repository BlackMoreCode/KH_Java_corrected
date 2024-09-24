package 등급출력;
// 국어, 영어, 수학 성적을 입력 받아서 총점을 구하고
// 평균이 90 점 이상이면 A
// 80점 이상이면 B
// 70 이상이면 C
// 60 이상 D
// 나머지 F
// 성적은 0~100 사이 입력되어야하고  입력 값이 잘못될 경우 재입력을 받아야한다.

import java.util.Scanner;

public class gradeEx {
    public static void main(String[] args){
        //이 경우가 강사님의 예시. 더 간결하다.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("성적 입력 (국어 영어 수학) : ");
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            if ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (math <0 || math > 100)) {
                System.out.print("성적 정보 입력을 제대로 하지 않았소...");
            } else {
                double avg = (double) (kor + eng + math) / 3;
                if (avg > 90) System.out.println("A");
                else if (avg > 80) System.out.println("B");
                else if (avg > 70) System.out.println("C");
                else if (avg > 60) System.out.println("D");
                else System.out.println("F");
                break;
            }


// //내 접근 방식..이지만 코드가 간결하지 못하다.
//        Scanner sc = new Scanner(System.in);
//        int kor = -1; // Initialize to an invalid value
//        while (kor < 0 || kor > 100) { // Loop until a valid score is entered
//            System.out.print("국어 성적을 입력하세요 (0~100): ");
//            kor = sc.nextInt();
//            if (kor < 0 || kor > 100) {
//                System.out.println("잘못된 입력입니다. 0~100 사이의 정수를 입력하시오.");
//            }
//        }
//        int eng = -1; // Initialize to an invalid value
//        while (eng < 0 || eng > 100) { // Loop until a valid score is entered
//            System.out.print("영어 성적을 입력하세요 (0~100): ");
//            eng = sc.nextInt();
//            if (eng < 0 || eng > 100) {
//                System.out.println("잘못된 입력입니다. 0~100 사이의 정수를 입력하시오.");
//            }
//        }
//        int math = -1; // Initialize to an invalid value
//        while (math < 0 || math > 100) { // Loop until a valid score is entered
//            System.out.print("수학 성적을 입력하세요 (0~100): ");
//            math = sc.nextInt();
//            if (math < 0 || math > 100) {
//                System.out.println("잘못된 입력입니다. 0~100 사이의 정수를 입력하시오.");
//            }
//        }
//        int total_grade = kor + eng + math;
//        double avg_grade = total_grade / 3;
//
//        if ( 0 < avg_grade && avg_grade <= 100) {
//            if (avg_grade >= 90) System.out.println(avg_grade + "는 A에 속합니다");
//            else if (avg_grade >= 80) System.out.println(avg_grade + "는 B에 속합니다");
//            else if (avg_grade >= 70) System.out.println(avg_grade + "는 C에 속합니다");
//            else if (avg_grade >= 60) System.out.println(avg_grade + "는 D에 속합니다");
//            else System.out.println(avg_grade + "는 F!! 낙제다!!");
        }
    }
}
