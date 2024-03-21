package mysub;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		
		Manage user = new Manage(10);
		int idCount = 3;
		ID id1 = new ID("asdf", "1234", 125000);
		ID id2 = new ID("qwer", "4321", 100000);
		ID id3 = new ID("zxcv", "5678", 50000);
		
		user.getIds()[0] = id1;
		user.getIds()[1] = id2;
		user.getIds()[2] = id3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 로그인?" + "2. 회원가입");
		// 메뉴선택(로그인할것이냐? 회원가입할것이냐
		while (true) {
			int menu = scan.nextInt();
			scan.nextLine();
			if (menu == 1) {	// 로그인을 성공할떄까지 한다.
				System.out.println("아이디 :");
				String id = scan.nextLine();
				System.out.println("비밀번호 :");
				String password = scan.nextLine();
				if(user.contain(id, password)) { 
					System.out.println("로그인 되었습니다");
				} else {
					System.out.println("로그인 정보가 틀립니다.");
				}
			} else if (menu == 2) {
				System.out.println("아이디 입력");
				String id = scan.nextLine();
				System.out.println("비밀번호 입력");
				String password = scan.nextLine();
				if (idCount <= 10) {
					for(int i = 0; i < user.getIds().length; i++) {
						if(user.getIds()[i].getId().equals(id)) {
							System.out.println("중복된 아이디 입니다.");
							break;
						} else {
							ID temp = new ID(id,password,0);
							user.getIds()[idCount] = temp;
							idCount++;
						}
					}
				}
			}
		
		}
	}
}
