// Book 클래스
// 1. 필드 정보
// 제목, 페이지수, 저자명
// 2. 메소드
// 모든 필드 값을 출력할 수 있는 메소드

// Magazine 클래스
// 1. 필드 정보
// 제목, 페이지수, 저자명, 발매일
// 모든 필드 값을 출력할 수 있는 메소드

// 각각의 클래스에
// 모든 필드를 초기화하는 생성자
// getter/setter
public class Test {
	public static void main(String[] args) {
		Book b = new Book("제목", 100, "이강현");
		Magazine m = new Magazine("제목2", 100, "이강현", "12월1일");
		
		b.printAll();
		m.printAll();
	}
}