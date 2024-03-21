// 이 주문들이 있을 때, 가격 순대로 처리.
// 피자
// 기본가격
// int 가격()
public class Pizza implements Comparable<Pizza> {
	private int price;
	private String name;
	public Pizza(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pizza [price=" + price + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Pizza o) {
		return this.price - o.price;
	}

}