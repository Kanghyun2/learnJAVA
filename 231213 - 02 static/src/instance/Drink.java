package instance;

public class Drink {
	private int pirce;

	private Drink(int pirce) {
		super();
		this.pirce = pirce;
	}
	
	public static Drink createInstance() {
		return new Drink(1000);
	}
	
	public static Drink createInstance(int price) {
		return new Drink(price);
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}
	
	
}
