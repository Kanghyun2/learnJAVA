package test;

import java.util.Scanner;

public class AccessProgram {
	public static void main(String[] args) {
		// 사용자 입력(아이디, 비밀번호)를 받아서, 해당 정보의 유무를 출력할수 있는 프로그램
		// 가입정보, 아이디, 비밀번호(String)
		// Pjava, l@veJava / qwer,1q2w3e / aaabb, cccdd

		// + 아이디, 비밀번호 등록기능 추가.
		Scanner scan = new Scanner(System.in);
		IdPw[] ipArr = new IdPw[10];
		for (int i = 0; i < ipArr.length; i++) {
			ipArr[i] = null;
		}
		IdPw ip1 = new IdPw("Pjava", "l@veJava");
		IdPw ip2 = new IdPw("qwer", "1q2w3e");
		IdPw ip3 = new IdPw("aaabb", "cccdd");
		ipArr[0] = ip1;
		ipArr[1] = ip2;
		ipArr[2] = ip3;
		int ipCount = 3;
		while (true) { // 로그인에 성공할때까지 반복실행
			System.out.println("메뉴를 선택하세요.\n1. 로그인\n2. 회원가입");
			int input = scan.nextInt();
			String inputId = "";
			String inputPw = "";
			boolean login = false;
			scan.nextLine();
			switch (input) {
			case 1:
				System.out.println("아이디를 입력하세요.");
				inputId = scan.nextLine();
				System.out.println("비밀번호를 입력하세요.");
				inputPw = scan.nextLine();
				for (int i = 0; i < ipArr.length; i++) {
					if (ipArr[i] != null) {
						login = ipArr[i].idpwCheck(inputId, inputPw);
						if (login) {
							break;
						}
					}
				}
				if (login) {
					System.out.println("로그인에 성공했습니다.");
					System.exit(0); // 로그인 성공시, 프로그램 종료
				} else {
					System.out.println("로그인에 실패했습니다.\n아이디와 비밀번호를 다시 입력해주세요.");
				}
				break;
			case 2:
				if (ipCount == 10) {
					System.out.println("더 이상 id를 등록할 수 없습니다.");
				} else {
					System.out.println("등록할 아이디를 입력하세요.");
					inputId = scan.nextLine();
					System.out.println("등록할 비밀번호를 입력하세요.");
					inputPw = scan.nextLine();
					IdPw ip = new IdPw(inputId, inputPw);
					for (int i = 0; i < ipArr.length; i++) { // 빈자리가 존재할경우, 입력한 id와 pw로 아이디를 만들어줌.
						if (ipArr[i] == null) {
							ipArr[i] = ip;
							ipCount++;
							break;
						}
					}
				}
				break;
			default:
				System.out.println("잘못된 메뉴를 선택했습니다. 다시 입력해주세요.");
			}
		}
	}
}
