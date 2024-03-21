package PizzaPizza;

class Bulgogi extends Pizza {
	private String size;

	public Bulgogi(int price) {
		super(price);
	}

	public Bulgogi(int price, String size) {
		super(price);
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}

public class Pizza {
	private int price;

	public Pizza(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}