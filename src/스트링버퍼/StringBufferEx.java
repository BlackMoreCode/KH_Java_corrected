package 스트링버퍼;
// 기본적으로 문자열 처리는 String 클래스를 사용하는 것이 일반적
// String 클래스로 문자열을 처리하는 경우.. 매번 새로운 문자열이 만들어진다.
// 그에 반해서 StringBuffer, StringBuilder 는 객체를 생성해 할당된 메모리에 계속 추가해나가는 방식.
// StringBuffer , StringBuilder는 사용 방법이 완전 동일. 방법은 동일하지만... 차이:
// StringBuffer: 멀티 쓰레드 환경을 지원  <-> StringBuilder 지원하지 않음.

public class StringBufferEx {
    public static void main(String[] args) {
//        // String 클래스 처리시
//        String rst = ""; // 원래는... String rst = new String("");
//        Integer age = 0; // Integer age = new Integer(0);  하지만 이건 deprecated 이지..
//        rst += "안녕하세요";
//        rst += " ";
//        rst += "자바";
//        rst += " 공부합니다.";
//        System.out.println(rst); //문자열을 계속 더한 예시
        // StringBuffer 사용 예시
        StringBuilder sb = new StringBuilder();
        sb.append("안녕하세요");
        sb.append(" ");
        sb.append("파이썬 ");
        sb.append("공부합니다.");
        sb.insert(0, "HIIIII");
        sb.delete(0,6);
        System.out.println(sb);
        System.out.println(sb.substring(0, 5));
    }
}
