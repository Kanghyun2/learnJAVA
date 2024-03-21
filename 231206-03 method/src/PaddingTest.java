
public class PaddingTest {
	public static void main(String[] args) {
		
		Padding m = new Padding();
		m.model = "NK-100";
		m.price = 100000;
		m.nameprice();
		m.isOn = false;
		m.onoff();
		m.onoff2();
		m.onoffprice = 0;
		m.halinPrice();
		int price2 = m.onPrice(100000, 0 , 100000);
		System.out.println("할인된 패딩가격 :" + price2);
		
		Padding m2 = new Padding();
		m2.model = "AD-200";
		m2.price = 50000;
		m2.nameprice();
		m2.isOn = true;
		m2.onoff();
		m2.onoff2();
		m2.onoffprice = 10;
		m2.halinPrice();
		int price3 = m2.onPrice(50000, 0.1 , 50000);
		System.out.println("할인된 패딩가격 :" + price3);
	}
}
