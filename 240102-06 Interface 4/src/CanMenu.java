interface MenuNumbers {
	// 정적 변수 // 필드 ㄴㄴ
	final int COLA = 1;
	final int CIDAR = 2;
	final int ORANGE_JUICE = 3;
}
public class CanMenu {
	public static void main(String[] args) {
		int userInput = 1;

		switch (userInput) {
		case MenuNumbers.COLA:
			System.out.println("콜라");
			break;
		case MenuNumbers.CIDAR:
			System.out.println("사이다");
			break;
		case MenuNumbers.ORANGE_JUICE:
			System.out.println("오렌지쥬스");
			break;
		default:
			System.out.println("메뉴 없음");
			break;
		}
	}
}
