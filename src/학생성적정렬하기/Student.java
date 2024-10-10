package 학생성적정렬하기;

public class Student implements Comparable<Student>{
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;


    @Override
    public int compareTo(Student o) {
//        if (this.getTotalScore() < o.getTotalScore()) return 1; // 점수 높은 순으로 정렬
//        else {
//            return this.name.compareTo(o.name); // 총점이 같으면 이름순으로 정렬
//        }
        if(this.getTotalScore() != o.getTotalScore()) {
            return o.getTotalScore() - this.getTotalScore(); // 뒤의 값이 큰 경우가 양수가 된다. = 내림차순이다
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "이름 " + name + " : " + getTotalScore();
    }

    public Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public int getTotalScore() {
        return korScore + engScore + mathScore;
    }
}
