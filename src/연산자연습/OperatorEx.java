package 연산자연습;
// 산술 연산자 : +, - , *, /, % (파이썬에 있던 //, ** 연산자는 없다)
// 대입연산자 : =, +=, -=, *=, /=, %=
// 증감 연산자: ++, -- (현재 값에서 1을 증가 / 감소 시키는 연산자)
// 비교 연산자 : >, <, >=, <=, !=, ==
// 논리 연산자 : &&(and), ||(or), !(not)
// 삼항 연산자 : 조건식 ? 참일 경우 수행 구문 : 거짓일 시 수행 구문
// 비트 연산자: 비트 단위의 저수준 조작을 하기 위한 연산자
import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args){
        int num1 = 10, num2 = 4;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        try {
            System.out.println(num1 / num2); // 정수끼리 나눗셈을 수행하면 몫이 구해진다. (나머지 값 유기)
            System.out.println((double)num1 / num2); // 제대로 10/4 = 2.5를 구현하려면 명시적 형변환을 동원해야한다.
            System.out.println(num1 % num2);
        } catch (ArithmeticException e) {
            System.out.println("0을 나눌 수 없습니다");
        }

        // 증감 연산자 : 해당 변수 값을 1 증가 또는 감소 시키는 연산자
        System.out.println(num1++); // 후위 증가 연산자; 먼저 대입 후 증가. 즉 이 경우 프린트에 먼저 찍고 증가해줌.
        System.out.println(num1++); // 그렇기에 이 경우 지금 프린트 되는 값은 11 이지만 실제 값은 12가 되있다.
        System.out.println(num1); // 현재 값 = 12

        System.out.println(++num1); // 전위 증감 연산자; 선 증가 후 대입

        // 대입 연산자
        System.out.println(num1 += 2); // num1 = num1 + 2
        System.out.println(num1 -= 2); // num1 = num1 - 2
        System.out.println(num1 *= 2); // num1 = num1 * 2
        System.out.println(num1 /= 2); // num1 = num1 / 2

        // 비교 연산자 : 두개의 피 연산자를 비교하여 큰지, 작은지, 같은지를 판단
        // 결과 값은 boolean값으로 반환; true/false
        int x = 10, y = 20;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        //논리 연산자 :
        // && (and) : 둘 다 만족해야 true.
        // || (or): 둘 중 하나만 만족해도 true
        // !(not): 현재에 조건에 대한 부정 = 반대가 되야한다.
        boolean rst1, rst2, rst3;
        rst1 = (x > 0) && (x > y); // false
        rst2 = (x > 0) || (x > y); // true
        rst3 = !((x > 0) || (x > y)); // false
        System.out.println(rst1 + " " + rst2 + " " + rst3 + " ");

        //삼항 연산자
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        String isAdult = (age > 19) ? "성인" : "미성년자";
        System.out.println("당신은 " + isAdult + "입니다.");

        //연산자 우선 순위 확인
        int val1 = 5, val2 = 5, val3 =5;
        System.out.println(val1 + val2 * val3); //30
        System.out.println((val1 + val2) * val3); //50
        System.out.println((val1 + ++val2) * val3); // 55

        //100 자리 정수를입력 받아서 3개의 변수에 나누어 담아서 출력하기
        Scanner num = new Scanner(System.in);
        System.out.print("100의 자리 정수를 입력하세요 : ");
        int thr_dig = num.nextInt();
        if ( 99 < thr_dig && thr_dig < 1000) {
            int a = thr_dig / 100; // 어차피 정수로 표현했으니 몫만 나오면 그게 100의 자리겠지?
            int b = (thr_dig % 100) / 10; // 나머지를 구하고, 그걸 10으로 가르면 10의 자리
            int c = thr_dig % 10; // 10으로 나머지를 구하려 하면 일의 자리만 남겠구나.
            System.out.println("백의 자리 : " + a + " 십의 자리 : " + b + " 일의 자리 : " + c);
        } else {
            System.out.println("100 자리 정수를 입력하시오!");
        }

    }
}
