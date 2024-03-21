// 3권의 책 생성
// 파워자바, 25000, 천인국, chun@naver.com
// 파워파이썬, 22000, 천인국 ,chun@naver.com
// 스프링웹프로젝트, 30000, 구멍가게코딩단, goo@gmail.com
public class TestBook {
	public static void main(String[] args) {
		Author chun = new Author("천인국", "chun@naver.com");
		Author goo = new Author("구멍가게코딩단", "goo@gmail.com");
		
		Book b1 = new Book("파워자바", 25000, chun);
		
		Book b2 = new Book("파워파이썬", 22000, chun);
		
		Book b3 = new Book("스프링웹프로젝트", 30000, goo);
		
		System.out.println(b1.getTitle());
		System.out.println(b1.getPrice());
		Author a = b1.getAuthor();
		System.out.println(b1.getAuthor().getName());
		System.out.println(b1.getAuthor().getEmail());
		System.out.println(b1.getAuthor() == b2.getAuthor());
	}
}
