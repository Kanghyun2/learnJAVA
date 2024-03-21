// 책
// 제목
// 가격
// 작가명
// 작가이메일
public class Book {
	private String title;
	private int price;
	private Author author;

	// 생성자 (모든필드)
	public Book(String title, int price, Author author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public String getAuthorName() {
		return author.getName();
	}
	
	public String getAuthorEmail() {
		return author.getEmail();
	}

}
