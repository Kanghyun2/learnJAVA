// 책장
// 책 3권
public class Bookshelf {
	private Book book1;
	private Book book2;
	private Book book3;
	
	public Bookshelf(Book book1, Book book2, Book book3) {
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
	
	public static void main(String[] args) {
		BookFactory fac = new BookFactory();
		Bookshelf bookshelf = new Bookshelf(
				fac.createPowerJava()
				, fac.createPowerJava()
				, fac.createPowerJava());
	
	}
}
