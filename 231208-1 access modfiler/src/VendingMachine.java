import java.util.Scanner;

// 사용자의 입력과 결과 출력을 통해
// 자판기 시뮬레이션

// 콘솔창에
// 1. 상품 목록  상품 1 상품 2 상품 3
// 2. 상품 선택 구입
public class VendingMachine {
	final String MENU1 = "콜라";
	final String MENU2 = "사이다";
	final String MENU3 = "오렌지쥬스";
	
	private void showList() {
		System.out.println("상품 목록");
		System.out.println("1." + MENU1);
		System.out.println("2." + MENU2);
		System.out.println("3." + MENU3);
		
	}

	private int userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("구입하실 상품의 번호를 입력하세요");
		int input = scan.nextInt();
		return input;
	}

	private void printResult(int input) {
		if (input == 1) {
			System.out.println("선택하신 물품은" + MENU1);
	} else if (input == 2) {
			System.out.println("선택하신 물품은" + MENU2);
	} else if (input == 3) {
			System.out.println("선택하신 물품은" + MENU3);
	}
}
	
	public void process() {
		while (true) {	
			showList();
			int input = userInput();
			if (input < 1 || input > 3)
				break;
			printResult(input);
		}
	}
}
