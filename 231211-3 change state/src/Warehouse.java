// 사료창고 클래스
// 사료의 양: int

public class Warehouse {
	private int meat;
	private int hay;
	
	public Warehouse(int meat, int hay) {
		this.meat = meat;
		this.hay = hay;
	}
	public int getMeat() {
		return meat;
	}
	public int getHay() {
		return hay;
	}
	public void decreasedMeat(int amount) {
		meat -= amount;
	}
	public void decreasedHay(int amount) {
		hay -= amount;
	}
	
}
