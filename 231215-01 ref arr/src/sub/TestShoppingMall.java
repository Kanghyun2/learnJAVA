package sub;
// 아 3시네 ....
import java.util.Scanner;

public class TestShoppingMall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 유저(고객) 배열 선언 및 초기화
		User[] userArr = new User[10]; // 길이가 10인 user를 담는 배열 생성
		for (int i = 0; i < userArr.length; i++) { // 배열 안의 모든 원소를 null로 초기화.
			userArr[i] = null;
		}
		// 유저 선언(초기값)
		User u1 = new User("admin", "0000"); // 관리자 계정
		User u2 = new User("asdf", "0000", 250000);
		User u3 = new User("zxcv", "7777", 200000);
		User buyer = null;
		// userArr의 0~2번째 인덱스에 초기유저를 넣음
		userArr[0] = u1;
		userArr[1] = u2;
		userArr[2] = u3;
		// 쇼핑몰 배열 생성 및 상품진열 .........
		ShoppingMall lotte = new ShoppingMall(); // 쇼핑몰 클래스에서 가져온 상품 
		Product p1 = new Product("청소기", 150000, 4);
		Product p2 = new Product("고기", 100000, 2); // 빈칸이 있어도 작동되는걸 보여줄거임 
		Product p3 = new Product("의자", 50000, 1);
		Product p4 = new Product("텀블러", 10000, 3);
		lotte.setproductAuto(p1);
		lotte.setproductAuto(p2);
		lotte.setproductAuto(p3);
		lotte.setproductAuto(p4);

		// 생성자로 Login 관리자 생성
		Login manager = new Login(userArr);

		while (true) { // 로그인화면 / 쇼핑몰화면 전체 반복문

			// 로그인 및 회원가입을 위한 반복문 실행
			String inputId = "";
			String inputPw = "";
			boolean loginBoolean = true; // 메뉴 선택 while문을 작동시키는 boolean값
			while (loginBoolean) { //
				System.out.println("메뉴를 선택해주세요.\n1. 로그인\n2. 회원가입\n100. 프로그램 종료");
				int inputNum = scan.nextInt();
				scan.nextLine(); // 스캐너 오류 방지
				switch (inputNum) {
				case 1:
					System.out.println("아이디를 입력해주세요.");
					inputId = scan.nextLine();
					System.out.println("비밀번호를 입력해주세요.");
					inputPw = scan.nextLine();
					if (manager.checkUser(inputId, inputPw)) { // 로그인에 성공했기때문에, 메뉴 선택을 더이상 하지 않아도 됨.
						buyer = manager.buyer(inputId, inputPw); // 로그인한 유저 ...바이어저장 ..............
						loginBoolean = false;
						break;
					}
					break;
				case 2:
					System.out.println("아이디를 입력해주세요.");
					inputId = scan.nextLine();
					System.out.println("비밀번호를 입력해주세요.");
					inputPw = scan.nextLine();
					if (manager.checkUser(inputId) == false) { // 아이디가 중복되지 않기에, 회원가입에 성공하여 유저 정보를 등록함.
						manager.setUserAuto(new User(inputId, inputPw));
						System.out.println("회원가입에 성공했습니다.");
					}
					break;
				case 100:
					System.exit(0);// 프로그램 강제종료
				default:
					System.out.println("1번 혹은 2번을 입력해주세요.");
					break;
				}
			}
			while (loginBoolean == false) {// 물건 구입 ........
				if (buyer == manager.getUserArr()[0]) { // 관리자 메뉴
					System.out.println("메뉴를 선택해주세요.\n1. 상품 관리\n2. 로그아웃");
					int managerinput = scan.nextInt();
					scan.nextLine();
					if (managerinput == 1) {
						if (lotte.getProductArr()[4] != null) {
							System.out.println("물건이 꽉 차있을경우 등록 못함");
						} else { // 상품 관리 등록 ...
							System.out.println("등록할 상품 이름입력");
							String inputString = scan.nextLine();
							System.out.println("등록할 상품 가격입력");
							int inputPrice = scan.nextInt();
							scan.nextLine();
							System.out.println("등록할 상품 개수입력");
							int inputStock = scan.nextInt();
							scan.nextLine();
							Product temp = new Product(inputString, inputPrice, inputStock);
							lotte.setproductAuto(temp);
						}
					} else if (managerinput == 2) {
						loginBoolean = true;
						buyer = null;
					} else {
						System.out.println("1 ~ 2의 숫자 선택");
					}
				} else { // 구매자 메뉴 .........
					System.out.println("메뉴를 선택해주세요.\n1. 상품 구입\n2. 돈 충전\n3. 유저 정보 확인\n4. 로그아웃");
					int input = scan.nextInt();
					scan.nextLine();

					switch (input) {
					case 1:
						lotte.info();
						System.out.println("구매하실 상품번호를 선택 해주세요.");
						int choice = scan.nextInt();
						lotte.buyProduct(choice, buyer);
						lotte.soldoutProduct(); // 재고가 없을 경우 재고가 없는 칸 정리
						break;
					case 2:
						System.out.println("얼마를 충전 하시겠습니까?");
						int moneyPlus = scan.nextInt();
						scan.nextLine();
						if (moneyPlus < 0) {
							System.out.println("잘못된 금액입니다.");
						} else {
							buyer.setMoney(buyer.getMoney() + moneyPlus);
						}
						break;
					case 3:
						buyer.info();
						break;
					case 4:
						loginBoolean = true;
						buyer = null; // 빈값으로 만들어 로그인한 계정값 초기화.......
						break;
					default:
						System.out.println("1 ~ 4의 숫자만 선택");
					}
				}
			}
		}
	}
}