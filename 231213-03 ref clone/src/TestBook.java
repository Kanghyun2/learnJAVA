// 책을 보관할 수 있는 책장에
// 파워자바, 20000
// 파워자바의 복사본
// 스프링, 25000
// 비어있음

public class TestBook {
	public static void main(String[] args) {
		BookShelf bookshelf = new BookShelf();
		Book powerJava = new Book("파워 자바", 20000);
		
		bookshelf.setBook1(powerJava);
//		bookshelf.setBook2(powerJava);
		bookshelf.setBook2(CopyWriter.shallowCopy(powerJava));
		Book book1 = bookshelf.getBook1();
		book1.setTitle("파워를자바라");
		Book book2 = bookshelf.getBook2();
		System.out.println(book2.getTitle());
		
		Book spring = new Book("스프링", 25000);
		bookshelf.setBook3(spring);
		
		bookshelf.setBook3(null);
		
		bookshelf.setBook4(spring);
	}
}
