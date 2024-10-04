package 인터페이스기본;

public interface NetworkAdapter {
    void connect(); // 인터페이스에 포함된 메서드는 자동으로 public abstract가 붙는다.
}

class WiFi implements NetworkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }

    // 부모측에서 구현한 것이 없으니까 자식측에서 무조건 구현을 해줘야한다.
    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결되었습니다.");
    }
}

class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }

    // 부모측에서 구현한 것이 없으니까 자식측에서 무조건 구현을 해줘야한다.
    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결되었습니다.");
    }
}

class LTE implements NetworkAdapter {
    String company;
    LTE(String company) {
        this.company = company;
    }

    // 부모측에서 구현한 것이 없으니까 자식측에서 무조건 구현을 해줘야한다.
    @Override
    public void connect() {
        System.out.println(company + " LTE에 연결되었습니다.");
    }
}