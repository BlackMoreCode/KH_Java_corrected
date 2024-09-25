package 참조타입;

public class ReferenceEx {
    public static void main(String[] args) {
        String name = "";
        String name2 = null;
        int age = 0; // null 값 사용 불가, 참조 타입이 아니기 때문
        Integer age2 = 0;

        int[] arr = null;

        Integer boxVal = null;
        int intVal = boxVal; //참조 타입의 값을 대입
        System.out.println(intVal);

    }
}
