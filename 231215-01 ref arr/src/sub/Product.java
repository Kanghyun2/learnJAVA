package sub;

// 물건의 정보를 담은 클래스
// 이름(String), 가격(int), 재고(int)
public class Product {
	private String name;
	private int price; 
	private int stock; // 물건재고

	public Product(String name, int price, int stock) { // 생성자.................................
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
