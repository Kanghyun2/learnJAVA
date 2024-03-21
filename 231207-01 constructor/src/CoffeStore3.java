//커피 가격
//현재판매량
//총판매량
public class CoffeStore3 {
int coffeePrice;
int coffeeCount;
	public CoffeStore3(int p) {
		 coffeePrice = p;
		System.out.println("커피 가격 :" + coffeePrice);
	}
	public void count(int c) {
		System.out.println("현재판매량" + coffeeCount); 
		coffeeCount += c;
		System.out.println("에서 " + c + "잔 더팔았습니다.");
	}
	public int sell() {
		return coffeePrice * coffeeCount;
	}
	public void printAll() {
		System.out.println("커피가격" +coffeePrice);
		System.out.println("현재판매량" + coffeeCount);
		System.out.println("총판매량" + sell());
		
	}
	
	public static void main(String[] args) {
		CoffeStore3 c = new CoffeStore3(2000);
		c.count(3);
		
		c.count(2);
		c.printAll();
		
	}
}
