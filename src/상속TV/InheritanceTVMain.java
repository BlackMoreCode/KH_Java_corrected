package 상속TV;
// 상속, 오버로딩, 오버라이딩 기본 동작을 이용해 TV만들기


public class InheritanceTVMain {
    public static void main(String[] args) {
//        ProductTV lgTV = new ProductTV("우리집 TV");
//        lgTV.setPower(true);
//        lgTV.setVolume(30);
//        lgTV.setChannel(30, true);
//        lgTV.tvInfo();
        ProtoTypeTV samTV = new ProductTV("남의집 TV");
        samTV.setChannel(99);
    }
}
