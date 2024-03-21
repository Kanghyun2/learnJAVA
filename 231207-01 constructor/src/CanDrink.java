// 캔 음료
// 상표명 : String
// 가격 : int
public class CanDrink {
	String name;
	int price;
	
	public CanDrink(String n, int p) {
		name = n;
		price = p;
	}
	
	public CanDrink() {
		name = "콜라";
		price = 2000;
	}
	
//	public CanDrink(int p, String n) {
//		price = p;
//		name = n;
//	}
	
	public static void main(String[] args) {
		CanDrink n = new CanDrink();
		System.out.println(n.name);
		System.out.println(n.price);
		
		CanDrink cola = new CanDrink("콜라", 2000);
		System.out.println(cola.name);
		System.out.println(cola.price);
		CanDrink cidar = new CanDrink("사이다", 1000);
	}
}
