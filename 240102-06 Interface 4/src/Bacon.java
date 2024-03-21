// 베이컨 피자
// 기본가격
// 베이컨 그램 수
// int 가격() => 기본가격 + 베이컨 그램 수 * 100
public class Bacon extends Pizza {
	private int bacon;

	public Bacon(int price, String name, int bacon) {
		super(price + bacon * 100, name);
		this.bacon = bacon;
	}

	public int getBacon() {
		return bacon;
	}

	public void setBacon(int bacon) {
		this.bacon = bacon;
	}
}	