package 학생성적정렬하기;

import java.util.Scanner;
import java.util.TreeSet;

// 5명의 학생에 대해 이름과 국어, 영어, 수학 성적을 입력 받아서 총점 기준으로 정렬
// 첫번째 조건은 총점 기준
// 총점이 같다면 이름의 사전순 정렬
public class StudentSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> treeSet = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("이름 입력: ");
            String name = sc.next();
            System.out.println("국어 성적 입력 : ");
            int korScore = sc.nextInt();
            System.out.println("영어 성적 입력 : ");
            int engScore = sc.nextInt();
            System.out.println("수학 성적 입력 : ");
            int mathScore = sc.nextInt();
            treeSet.add(new Student(name, korScore, engScore, mathScore));
        }
        System.out.println("=== 성적 총점 출력 ===");
        for (Student e : treeSet) { //e 가 자동으로 toString을 사용한 것. 표기 안해도.. 그래서 Student 클래스에서 오버라이딩 했음.
            System.out.println(e);
        }
    }
}
