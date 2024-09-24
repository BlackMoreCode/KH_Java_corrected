package 비트연산자;

public class BitOperatorEx {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2); // 8
        System.out.println(num1 | num2); // 14
        System.out.println(num1 ^ num2); // ^; XOR; 6
        System.out.println(~num1); // -11; 반전
        System.out.println(num1 << 1); // 20; (왼쪽으로) 시프트 연산자 00001010 --> 00010100
        System.out.println(num1 >> 1); // 5;
    }
}
