package Enum클래스예제2번;

enum DevType {
    MOBILE, FRONTEND, BACKEND, DBA, ANALYSIS
}

enum Career {
    JUNIOR, SENIOR
}

enum Gender {
    MALE, FEMALE
}

class Developer {
    private String name;    // 여기에는 위에 제약 조건을 안걸었으므로 문자열중 아무거나
    private DevType type;   // 여기는 위에 제약을 걸었으니까 위에서 명시한 것중 하나만
    private Career career;
    private Gender gender;

    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }
    public void devInfo() {
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + type);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);
    }
}

public class EnumClassEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer ("JOJO", DevType.FRONTEND, Career.SENIOR, Gender.MALE);
        developer.devInfo();
    }
}
