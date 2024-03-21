// 학생을 표현한 클래스
// 국어(int)
// 영어(int)
// 수학(int)
// 이름(String)

// 자신의 이름을 출력하는 메소드 - public void ???() {문장} -
// 자신의 총점을 출력하는 메소드
// 자신의 이름과 총점을 모두 출력할 수 있음.
public class Student {
	int kor;
	int eng;
	int math;
	String name;

	public void printAll() {
		printName();
		printScore();
	}
	
	public void printName() {
		System.out.println("이름 :" + name);
	}

	public void printScore() {
		System.out.println("총점 :" + (kor + eng + math));
	}
}
