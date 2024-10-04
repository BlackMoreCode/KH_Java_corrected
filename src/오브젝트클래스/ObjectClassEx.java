package 오브젝트클래스;
// Object 클래스 : 모든 JAVA 클래스의 조상 클래스;
// Object 클래스는 필드 없이 11개의 메서드로 구성;

public class ObjectClassEx {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.getClass()); // 해당 객체의 클래스 타입을 반환

        // equals는 String인 경우에는 문자열의 내용을 비교하는 동작이지만 (String에서는 equals()를 오버라이딩 해서 사용한 것이다)
        // 하지만 equals()는 본디 해당 인스턴스를 매개변수로 전달 받는 참조 변수와 비교하여 결과를 반환
        // => 해시코드를 비교함
        System.out.println(student1.equals(student2));
        student1 = student2;
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        //toString() 대부분의 경우는 오버라이딩해서 객체 내부의 정보를 표시함
        // 오버라이딩을 하지 않는 경우 해당 객체의 정보를 문자열로 출력
        // 출력포맷 => 패키지이름.클래스이름@해시코드에 대한 16진수
        System.out.println(student1.toString());    // 오브젝트클래스.Student@119d7047
        System.out.println(student2.toString());
    }
}

class Student {
    int id;
    String name;
}
