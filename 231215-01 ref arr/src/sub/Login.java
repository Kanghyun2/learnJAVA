package sub;

public class Login {
	private User[] userArr;

	public Login(User[] userArr) {
		this.userArr = userArr;
	}

	public User[] getUserArr() {
		return userArr;
	}

	public void setUserArr(User[] userArr) {
		this.userArr = userArr;
	}

	public void setUserAuto(User user) { // 앞에서부터 반복문으로 빈 공간을 찾아 user를 배열에 넣는 메소드
		for (int i = 0; i < userArr.length; i++) {
			if (userArr[i] == null) {
				userArr[i] = user;
				break;
			} else if (i == userArr.length - 1) {
				System.out.println("회원 공간이 가득차 더 이상 회원가입을 할 수 없습니다.");
			}
		}
	}

	public boolean checkUser(String id, String pw) { // 유저의 로그인정보가 등록된 정보인지 체크해주는 메소드
		boolean idMatch = false;
		for (int i = 0; i < userArr.length; i++) {
			if (userArr[i] != null) {
				if (userArr[i].getId().equals(id) && userArr[i].getPw().equals(pw)) {
					System.out.println("로그인에 성공했습니다.");
					idMatch = true;
					break;
				}
			}
		}
		return idMatch;
	}

	public User buyer(String id, String pw) { // 로그인 성공한 ID 저장 널값을 피함
		User temp = null;
		for (int i = 0; i < userArr.length; i++) {
			if (userArr[i] != null) {
				if (userArr[i].getId().equals(id) && userArr[i].getPw().equals(pw)) {
					temp = userArr[i];
					break;
				}
			}
		}
		return temp;
	}

	public boolean checkUser(String id) { // 회원가입시, 중복 아이디의 존재 여부를 체크하는 메소드
		boolean idExist = true;
		for (int i = 0; i < userArr.length; i++) {
			if (userArr[i] != null) {
				if (userArr[i].getId().equals(id)) {
					System.out.println("중복된 아이디가 존재합니다.\n다시 입력해주세요.");
					idExist = true;
					break;
				} else {
					idExist = false;
				}
			}
		}
		return idExist;
	}
}
