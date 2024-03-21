// 패딩
// 모델명 : String
// 실가격 : int
// 할인중 : boolean
// 할인율 : int

// 구입 시 지불해야 하는 가격을 반환하는 메소드 : int // 소수점 버림

// NK-100
// 100000
// false
// 0
// 100000

// AD-200
// 50000
// true
// 10
// => 45000
public class Padding {
	String model;
	int price;
	boolean isOn;
	int onoffprice;

	public void nameprice() {
		System.out.println("모델이름은 :" + model);
		System.out.println("패딩가격 :" + price);
	}

	public void onoff() {
		isOn = !isOn;
	}

	public void onoff2() {
		if (isOn) {
			System.out.println("할인안함");
		} else {
			System.out.println("할인중");
		}
	}
	public void halinPrice() {
		System.out.println("할인율 :" + onoffprice + "%");
	}

	public int onPrice(int left, double middle, int right) {
		int price2 = (int) (left - middle * right);
		int price3 = (int) (left - middle * right);
		return price2;

	}
}
