package 회원정보예제;

import java.util.Scanner;

public class Member {
    // 필드 추가 (필드는  클래스 내에 존재하는 변수를 지칭; 인스턴스 필드, 정적 필드, 지역 필드)
    private String name;    // private 접근제한자; 같은 클래스 내에서만 접근 가능.
    private int age;
    private char gender;
    private int job;
    private Scanner sc = new Scanner(System.in);
    // 자바에서 생성자를 만들지 않으면 기본 생성자가 자동으로 만들어진다; 자바에서는 생성자가 클래스 이름과 같고, 반환 값이 없다.

    public void setName() {
        System.out.print("이름을 입력 : ");
        name = sc.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setAge() {
        while(true) {
            System.out.print("나이를 입력 : ");
            age = sc.nextInt();
            if (age >= 0 && age < 200) return;
            System.out.println("나이를 잘못 입력하였습니다. 재입력 하십시오");
        }
    }

    public void setGender() {
        while(true) {
            System.out.print("성별을 입력 : ");
            gender = sc.next().charAt(0); // 문자에 대한 입력은 문자열에 해당 인덱스의 문자를 추출
            switch (gender) {
                case 'M' : case 'm' : case 'F' : case 'f' : return;
                default:
                    System.out.println("성별을 잘못 기입했습니다.");
            }
        }
    }

    public int getGenderType() { // 반환 타입이 존재하는 메서드(int)
        if (gender == 'M' || gender == 'm') return 1;
        else return 2;
    }

    public void setJob() {
        while(true) {
            System.out.print("직업을 입력 : ");
            job = sc.nextInt();
            if (job >= 1 && job < 5) return;
            System.out.println("직업을 잘못 입력하였습니다.");
        }
    }

    public void getInfo(){
        String[] genderStr = {"", "남성", "여성"}; // 입력된 값과 배열의 인덱스를 일치하기 위해서 첫번째를 비워둔다 (0번 인덱스 비우기)
        String[] jobStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("====== 회원정보 ======");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobStr[job])
;    }
}
