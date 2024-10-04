package 다중인터페이스2번;

public class MultiInterEx2 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.sell();
        customer.buy();
        customer.order();
    }
}

interface Buy {
    void buy();
    default void order() {  // default마치 인터페이스의 예외조항 같은 느낌; 구현부가 필요하니까.
        System.out.println("구매 주문");
    }
}

interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}

class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() {
        System.out.println("고객 주문");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }


}