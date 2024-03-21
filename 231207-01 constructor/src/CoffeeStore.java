// 커피가게
// 커피가격 : int
// 판매량 : int

// 생성자(int) { 커피가격 초기화, 판매량(기본값 0) }

// void 판매량 증가(int)
// int 총매출()
public class CoffeeStore {
	int coffeePrice;
	int totalCount;
	
	public CoffeeStore(int p) {
		coffeePrice = p;
		System.out.println("커피 가격 설정: " + coffeePrice);
	}
	
	public void printAll() {
		System.out.println("커피 가격: " + coffeePrice);
		System.out.println("총 판매량: " + totalCount);
		System.out.println("현재까지 총 매출: " + totalSales());
	}

	public void addCount(int c) {
		System.out.println("현재 판매량 " + totalCount);
		totalCount += c;
		System.out.println("에서 추가 " + c + "잔을 더 판매했습니다.");
	}

	public int totalSales() {
		return coffeePrice * totalCount;
	}

	public static void main(String[] args) {
		CoffeeStore store = new CoffeeStore(2000);
		
		store.addCount(3);
		store.addCount(4);
		store.printAll();
	}
}





