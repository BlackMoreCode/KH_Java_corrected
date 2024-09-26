package 생성자오버로딩;
// 생성자 오버로딩: 생성자는 클래스가 객체로 만들어 질 때 호출
// 생성자 주요 사용 용도: 인스턴스 필드 초기화
// 생성자는 만들지 않으면 기본 생성자가 자동으로 생성된다 (매개변수가 없는 기본 생성자)
// 생성자는 용도에 맞게끔 다양한 생성자를 만들 수 있다 (생성자 오버로딩이 되는 것)
public class OverloadingEx {
    public static void main(String[] args) {
        Television localTV = new Television();
        localTV.getTV();
//        localTV.setChannel(10000000);
        Television NA_TV = new Television(true, 100, 50);
        NA_TV.getTV();
    }
}
