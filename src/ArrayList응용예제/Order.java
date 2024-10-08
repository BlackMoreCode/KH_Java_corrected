package ArrayList응용예제;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Order {
    private final ArrayList<Product> products; //ArrayList에 대한 참조 변수를 만든 것
    private BigDecimal total;

    public Order() {
        this.products = new ArrayList<>();  // products가 ArrayList 주소를 부여해 줘서 초기값을 설정했다. 실제 존재하는 주소를 넣기 위해서 작업을 한다.
        this.total = BigDecimal.ZERO; // 총 가격 초기값 설정
    }

    public void addItem(Product product) {
        products.add(product); // ArrayList에 product를 추가
        total = total.add(product.getPrice());  // product 객체에서 값을 getter인 getPrice로 구하고 추가
        //객체 타입이라 += 가 아닌 = 로 처리
    }

    public Product getItem(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public boolean removeItem(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product); //해당 요소를 삭제.
                total = total.subtract(product.getPrice());
                return true;
            }
        }
        return false;
    }

    public BigDecimal calculateFinalPrice(BigDecimal taxRate) {
        BigDecimal taxAmount = total.multiply(taxRate);
        BigDecimal finalPrice = total.add(taxAmount);
        return finalPrice.setScale(2, RoundingMode.HALF_UP); //scale = 소숫점 자리 정하기
    }
}
