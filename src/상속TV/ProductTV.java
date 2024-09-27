package 상속TV;
import static 아이패드주문하기.Common.*;

public class ProductTV extends ProtoTypeTV {
    String name;
    boolean isInternet; // TV 인터넷 기능 ON/OFF 지원 설정값

    public ProductTV(String name) {
        super(false, 10, 10); // super() = 부모의 생성자를 불러주는 메서드
        this.name = name;
    }

    void setPower(boolean isPower) {
        this.isPower = isPower;
    }

    void setVolume(int vol) {
        if (MIN_VOLUME >= 0 && vol <= MAX_VOLUME) {
            this.volume = vol;
        } else {
            System.out.println("볼륨 설정 범위를 벗어났습니다.");
        }
    }
    @Override //오버라이딩
    public void setChannel(int cnl) {
        if (cnl > 0 && cnl < PRODUCT_CHANNEL_MAX) {
            channel = cnl;
            System.out.println("채널을" + channel + " 변경하였습니다.");
        } else  System.out.println("채널 설정 범위를 벗어났습니다.");
    }

    //오버로딩 해보기
    public void setChannel(int cnl, boolean isInternet) {
        if (isInternet) {
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        } else {
            this.isInternet = false;
            if (cnl > 0 && cnl < PRODUCT_CHANNEL_MAX) {
                channel = cnl;
                System.out.println("채널을" + channel + " 변경하였습니다.");
            } else  System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }

    void tvInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 모드 : " + isInternet);
    }
}
