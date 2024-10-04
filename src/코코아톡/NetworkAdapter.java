package 코코아톡;

public interface NetworkAdapter {
    void connect();     // public abstract 추가 된다. 추상메서드여야하기 때문.
    void send(String msg);
}

class WiFi implements NetworkAdapter {
    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}

class FiveG implements NetworkAdapter {
    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}

class LTE implements NetworkAdapter {
    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("LTE >> " + msg);
    }
}