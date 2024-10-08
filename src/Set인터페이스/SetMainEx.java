package Set인터페이스;

import java.util.Arrays;
import java.util.HashSet;

public class SetMainEx {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        hashSet.add(new Member(1001, "Lina"));
        hashSet.add(new Member(1002, "Karl"));
        hashSet.add(new Member(1003, "Mirana"));
        hashSet.add(new Member(1003, "Anti-mage"));
        for(Member e : hashSet) e.showMember();
    }
}

class Member {
    int id;
    String name;
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj; // 다운캐스팅 처리
            if (this.id == member.id) return true;
            else return false;
        }
        return false;   //hashCode와 equals 둘 다 false 여야 다른 객체다.
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;

    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}