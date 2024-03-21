
// 1. 좌석 예약 프로그램 (콘솔 입출력)
// 10개의 좌석이 준비되어 있음
// 사용자는 메뉴 선택 입력을 통해, 현재 좌석 예약 상태를 볼 수 있어야 함.
// 출력예 1 2 3 4 5 6 7 8 9 10 (O : 예약가능한 좌석, X : 예약된 좌석)
//      O X X O X O O O X X
//- 사용자는 메뉴 선택 입력을 통해, 좌석을 예약할 수 있어야 함.
// 예 ) 몇번째 좌석을 예약하시겠습니까? 4
// 예약 되었습니다..
// 1 2 3 4 5 6 7 8 9 10
// O X X X X O O O X X
import java.util.Scanner;

public class Seats {
	public static char charAt(char[] target, int index) {
		if (index >= 0 && index < target.length) {
			return target[index];
		}
		return 0;

	}
	public static int printMenu() {
		System.out.println("1. 현재 좌석 상태 확인");
		System.out.println("2. 좌석 예약");
		System.out.println("기타. 종료");
		
		Scanner scan = new Scanner(System.in);
		int menuNum = scan.nextInt();
		return menuNum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
		int menuNum = printMenu();
		
		if(menuNum == 1) {
		System.out.println("(O : 예약가능한 좌석 , X : 예약된 좌석)");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("O X X O X O O O X X");
		} else if (menuNum == 2) {
		char[] seat = new char[] { 'O', 'X', 'X', 'O', 'X', 'O', 'O', 'O', 'X', 'X' };
	
			System.out.println("몇번째 좌석을 예약하시겠습니까?");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			
			char ch = charAt(seat, scan.nextInt()-1);
			System.out.println(ch);
			if (ch == ('X')) {
				System.out.println("예약된 좌석입니다 다른 좌석을 선택해 주세요");
			} else if (ch == ('O')) {
				ch = 'X';
				// System.out.println("1 2 3 4 5 6 7 8 9 10");
				// System.out.println(seat);
				System.out.println("예약 되었습니다.");
				break;
			}
		}
	}
}
}