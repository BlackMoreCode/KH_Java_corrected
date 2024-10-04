package 중첩인터페이스;
// 클래스 내부에 선언된 인터페이스
//중첩인터페이스는 주로 UI 프로그래밍에서 이벤트 처리 및 목적으로 활용
public class NestedInterfaceEx {
    public static void main(String[] args) {
        Button button1 = new Button();
        button1.setOnClickListner(new CallListner());
        button1.touch();

        Button button2 = new Button();
        button2.setOnClickListner(new MessageListner());
        button2.touch();
    }
}
