package 회원정보예제;

// 이름은 String 으로 받는다
// 나이는 int 로 받는다; 0 ~ 199 까지만 정상으로 간주, 다른 값이 들어온다면 재입력 요구 한다.
// 숫자가 아닌 다른 값이 오는 경우에 대한 처리는 일단 무시 (가능하면 별도 진행처리해도 됨)
// 성별은 문자 타입으로 받는다. 남성 = 'M' 혹은 'm', 여성 = 'F' 혹은 'f'
// 성별에 대한 출력은 "남성" 과 "여성" 으로 출력해야한다.
// 직업은 정수로 입력 (1 ~ 4 입력). 1 = 학생, 2 = 회사원, 3 = 주부, 4 = 무직.
// 1 ~ 4가 아니라면 재입력 (while 문 이용?)
// 결과는 한번에 출력.

public class MemberInfoEx {
    public static void main(String[] args) {
        // Member 클래스에 대한 객체를 생성하기 위해 기본 생성자 호출
        Member member = new Member();
        member.setName();
        member.setAge();
        member.setGender();
        member.setJob();
        member.getInfo();
        // 회원의 이름 확인
        System.out.println("회원의 이름 : " + member.getName());
    }
}
