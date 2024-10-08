package 제네릭프린터;

// <T extends Material> Material 클래스로부터 상속 받은 타입만 올 수 있음
public class GenericPrinter<T extends Material> {
    private T material;  //T타입 변수로 재료의 형태가 결정난다.

    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
    public void printing() {
        material.doPrinting();
    }
}
