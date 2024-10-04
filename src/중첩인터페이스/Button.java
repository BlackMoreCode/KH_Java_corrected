package 중첩인터페이스;

public class Button {
    // OnClickListner 인터페이스에 대한 참조 변수, 외부에 객체를 만들어서 주입하는 형태
    OnClickListner listner;

    void setOnClickListner(OnClickListner listner) {
        this.listner = listner;

    };

    void touch() {
        listner.onClick();
    }

    interface OnClickListner {
        void onClick(); //추상 메서드
    }
}
