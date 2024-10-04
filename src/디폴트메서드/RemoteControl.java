package 디폴트메서드;
// 디폴트 메서드 : 인터페이스에서 구현부가 있는 메서드를 의미

public interface RemoteControl {
    int MAX_VOLUME = 100; // 인터페이스에 포함된 필드는 모든 상수로 만들어짐 (자동으로 final static 이 추가된다)
    int MIN_VOLUME = 0; // static이 붙는다 = 객체화가 안된다 = 상속이 안된다. 설계 명세에 기재된 값을 안내하는 것이 목적
    // 설계 명세에서 볼륨의 설정 범위를 표시하기 위해서 사용 할 수 있음.
    public void turnON(); // 자동으로 앞에 public abstract 가 붙는다.
    public void turnOFF();
    public void setVolume(int volume);
    // 디폴트 메서드는 이 후 추가 (예외 조항); 오버라이딩을 해도 되고 안해도 되는 선택적 조항?
    default void setMute(boolean mute) {
        if (mute) System.out.print("무음 처리합니다.");
        else System.out.print("무음 처리를 해제합니다.");
    }

    // 인터페이스 생성시 함께 생성되고 상속이 되지 않는다.
    // 그러므로 구현부가 있어도 된다.
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
