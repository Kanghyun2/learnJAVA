public class Money {
	public static final int SINGLE = 100000;
	public static final int DISCOUNT = 10;
	
	private int money;

    public Money(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}