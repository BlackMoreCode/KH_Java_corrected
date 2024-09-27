package 상속TV;
import static 아이패드주문하기.Common.PROTOTYPE_CHANNEL_MAX;

public class ProtoTypeTV {
    boolean isPower; // 전원 ON/OFF 설정값
    int channel; // 채널 설정값
    int volume; // 볼륨 설정값

    public ProtoTypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }

    public void setChannel(int cnl) {
        if (cnl > 0 && PROTOTYPE_CHANNEL_MAX < 1000) {
            channel = cnl;
        } else {
            System.out.print("채널 설정 범위가 아닙니다");
        }
    }
}
