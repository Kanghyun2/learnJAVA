
public class CopyWriter {
	public static Book shallowCopy(Book book) {
		return new Book(book.getTitle(), book.getPrice());
		// 인스턴스 생성
	}
}
