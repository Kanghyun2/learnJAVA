// 책 4권을 보관하고 있는 책장에
// 파워자바, 20000원 4권을 보관하고 있습니다.
// 스프링, 25000원 구입을 했음.

// 당근마켓에 판매 (중고가로 절반의 가격을 받을거임)
// 책장에 비상금으로 숨겨둠.
public class TestCarrot {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(); // 책장
		Book powerJava = new Book("파워 자바", 20000); // 책
		
		bookShelf.setBook1(powerJava); // 책장에 꽂기
		bookShelf.setBook2(powerJava); // 필요한 정보 생각
		bookShelf.setBook3(powerJava);
		bookShelf.setBook4(powerJava);
		
		bookShelf.setBook1(null);
		bookShelf.setBook2(null);
		bookShelf.setBook3(null);
		
		int price = powerJava.getPrice() / 2;
		int income = price * 3;
		
		bookShelf.setMoney(income);
		
		Book spring = new Book("스프링", 25000);
		
		bookShelf.setMoney(bookShelf.getMoney() - spring.getPrice());
		
		bookShelf.setBook1(spring);
	}
}
