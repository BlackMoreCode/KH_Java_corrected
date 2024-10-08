package Wrapper클래스;
// Wrapper 클래스란 => 기본 타입의 대이터를 객체 ㄷ데이터를 객체 타입으로 취급하도록 변환해주는 클래스
public class WrapClassEx {
    public static void main(String[] args) {

//        IntegerEx integerEx = new IntegerEx();
//        IntegerEx.x = 100;
//        System.out.println(integerEx.x);
        // Boxing : 클래스 안에다가 변수를 집어 넣기; 참조 타입에다가 기본 타입을 넣는 것.
        Integer x = 100; // Auto Boxing
        int xx = x;
    }
}

//class IntegerEx {
//    int x;
//}
