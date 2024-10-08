package List인터페이스실습;
//  Vector는 ArrayList와 동일한 내부 구조를 지닌다.
//  차이점은 동기화(synchronized) 된 메서드로 구성되어 있어 멀티 쓰레드 환경에서 안전.
//


import java.util.List;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("천마이클 잭슨", "mj@gmail.com", "010-1234-5678", "GOD"));
        list.add(new NameCard("도널드 트럼프", "realdonald@gmail.com", "010-1234-5678", "Repulican candidate"));
        list.add(new NameCard("김정은", "fatman@gmail.com", "010-1234-5678", "dictator of NK"));
        list.add(new NameCard("JOJO", "jojo@gmail.com", "010-1234-5678", "STANDOPOWAAAH"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("이메일 : " + e.email);
            System.out.println("전화번호 : " + e.phone);
            System.out.println("직업 : " + e.job);
        }
    }
}

class NameCard {
    String name;
    String email;
    String phone;
    String job;

    public NameCard(String name, String email, String phone, String job) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.job = job;
    }
}