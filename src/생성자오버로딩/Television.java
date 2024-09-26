package 생성자오버로딩;
//생성자는 클래스 이름과 같고 반환 타입이 없음(void 안됨). 반환 타입 자체가 없음
// 생성자는 외부에서 접근해야하기 때문에 일반적으류 public 접근 제한자 사용
// 싱글톤 객체를 생성할 때 접근 제한자를 private해서 객체 생성을 제한할 수 있음
public class Television {
    private boolean isON; /// 전원 ON/OFF
    private int channel; // 채널 설정
    private int volume; // 볼륨 설정
    // 기본 생성자는 생성자가 없는 경우 자동생성
    public Television() {
        isON = false;
        channel = 10;
        volume = 10;
        System.out.println("매개변수가 없는 생성자 호출");
    }

    public Television(boolean isON, int channel, int volume) {
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
        System.out.println("매개변수가 전부 있는 생성자 호출");
    }

    public void setON(boolean onOff) {
        isON = onOff;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV" + onOffStr);
    }

    public void setChannel(int cnl) {
        if (cnl >= 1 && cnl <= 999) {
            channel = cnl;
            System.out.print("채널을 " + channel + "변경하였습니다");
        }
    }

    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.print("볼륨을 " + vol + "변경하였습니다");
        }
    }

    public void getTV() {
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("====== TV State ======");
        System.out.printf("전원 : %s\n", onOffStr);
        System.out.printf("볼륨 : %d\n", volume);
        System.out.printf("채널 : %d\n", channel);
    }
}
