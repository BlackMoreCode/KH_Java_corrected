package Math클래스;

import java.math.BigDecimal;
import java.math.RoundingMode;

// 클래스 메서드: 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스 (엄밀히 따지면 자바는 함수가 없고 메서드만 있지만..)
// 모든 메서드는 클래스 메서드이므로, 객체 생성 없이 바로 사용
// java.lang에 포함되어 있어 별도의 import 가 필요 없다.
public class MathClassEx {
    public static void main(String[] args) {
//        randomFunction();
        MathMethodFunc();
    }
    // random() 메서드 => 0.0 이상, 1.0 미만의 범위에서 임의의 double형 값 한개를 반환
    static void randomFunction() {
        for(int i = 0; i < 50; i++) {
            System.out.println((int)(Math.random() * 100) + 1 + " "); // 1 ~ 100 사이의 임의의 수를 생성
        }
    }
    // abs() 메서드 : 절대값을 구하는 메서드
    // floor() : 주어진 숫자를 내림한 결과를 반환
    // ceil() : 주어진 숫자를 올림한 결과를 반환
    // round() : 소수점 첫째자리에서 반올림한 결과를 반환
    // BigDecimal() : 메서드를 import해서 사용하는 방법이 권장된다 (객체타입이라 메서드가 많다)
    static void MathMethodFunc() {
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));
        // floor() 사용
        System.out.println(Math.floor(10.999999999));
        // ceil()
        System.out.println(Math.ceil(10.000000001));
        // round()
        System.out.println(Math.round(10.49999999));    // 10; 소숫점 첫째 자리를 반올림
        System.out.println(Math.round(10.59999999));    //11;
        // min() / max()
        System.out.println(Math.min(20, 30));
        System.out.println(Math.max(20, 30));
        // BigDecimal
        BigDecimal number = new BigDecimal("10.355");
        System.out.println(number.setScale(2, RoundingMode.HALF_UP)); // 2번째 자리에서 반올림 해라라고 지정했다. 10.36
    }
}
