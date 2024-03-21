// 영화 클래스를 작성해보기
// 영화제목
// 평점
// 감독
// 발표된 연도
// 모든 필드를 초기화 생성자
public class Q1207 {
	String movieTitle;
	String director;
	int grade;
	String date;
	public Q1207 (String movieTitle, String director, int grade, String date) {
		this.movieTitle = movieTitle;
		this.director = director;
		this.grade = grade;
		this.date = date;
	}
	
	public String getTitle() {
		return movieTitle;
	}
	public void setTitle(String title) {
		this.movieTitle = movieTitle;
	}
	
	public void printAll() {
		System.out.println(movieTitle);
		System.out.println(director);
		System.out.println(grade);
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		Q1207 q = new Q1207("영화제목", "감독이름", 80, "23년12월7일");
				q.printAll();
				
			//	QQ1207 k = new QQ1207(10, 20, 30);
			//	System.out.println(k.width);
	}
}

