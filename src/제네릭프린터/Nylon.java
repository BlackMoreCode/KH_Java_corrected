package 제네릭프린터;

public class Nylon extends Material{
    public void doPrinting() {
        System.out.println("Nylon 재료를 출력합니다.");
    }
    @Override
    public String toString() {
        return "재료는 Powder입니다.";
    }
}
