package 싱글톤;

public class Singleton {
    String name;
    int id;
    // 정적 변수로 Singleton 클래스에 대한 참조변수를 만들고 =>
    private static Singleton singleton = new Singleton();
    private Singleton() {
        name = "곰돌이사육사";
        id = 100;
    }
    static Singleton getSingleton() {
        return singleton;
    }
}
