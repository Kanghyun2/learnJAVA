// 페퍼로니 피자
// 기본가격
// 페퍼로니 개수
// int 가격() => 기본가격 + 페퍼로니 개수 * 500
public class Pepperoni extends Pizza{
	private int pepperoni;

	public Pepperoni(int price, String name, int pepperoni) {
		super(price + pepperoni * 500, name);
		this.pepperoni = pepperoni;
	}

	public int getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(int pepperoni) {
		this.pepperoni = pepperoni;
	}
}	

