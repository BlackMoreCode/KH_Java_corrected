package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30;  // 상수취급; final static 이 자동으로 추가된다. 설계명세서 역할
    int MIN_TEMP = 0;
    void airConON();    // public abstract 가 붙는다. 자식 클래스에서 무조건 오버라이딩 해야한다.
    void airConOFF();
    void setAirConTemp(int tmp);
}
