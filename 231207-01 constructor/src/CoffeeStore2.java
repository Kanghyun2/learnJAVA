// 커피가격
// 현재 판매량 증가
// 커피 총판매량

public class CoffeeStore2 {
int coffeePrice;
int count;
	public CoffeeStore2(int p) {
		coffeePrice = p;
	}
	public void coffeeCount(int c) {
		System.out.println("현재판매량" + count);
		count += c;
		System.out.println("에서 " + c + "잔 더팔았습니다.");
	}
	public int sell() {
		return coffeePrice * count;
		
	}
	public void printAll() {
		System.out.println("커피 가격" + coffeePrice);
		System.out.println("현재 판매량" + count);
		System.out.println("총판매량 " + sell());
		
	}
	
	public static void main(String[] args) {
		CoffeeStore2 c = new CoffeeStore2(2000);
		c.coffeeCount(3);
		c.printAll();
		c.coffeeCount(5);
		c.printAll();
	}
}

	