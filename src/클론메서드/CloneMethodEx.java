package 클론메서드;
// clone() : 해당 인스턴스를 복제하여 새로운 인스턴스를 생성, 반환.
// 얕은 복사: 필드의 값만 복사하는 방법, 기본 타입의 경우 값이 복사;
// 참조 타입의 경우 참조하는 곳의 주소 값이 복사.



public class CloneMethodEx {
    public static void main(String[] args) {
        Member mem1 = new Member("memed", "GM_BlackMore", "quaswex", 30, true);
//        Member mem2 = mem1; //얕은 복사
        Member mem2 = mem1.getMember(); //깊은 복사

        mem2.id = "test1234";
        mem2.name = "testacc";

        System.out.println("이름 : " + mem1.name);
        System.out.println("이름 : " + mem2.name);

        System.out.println("아이디 : " + mem1.id);
        System.out.println("아이디 : " + mem2.id);

    }
}
