package sub;

public class User {
	private String id;
	private String pw;
	private String membership;
	private int money;
	private int totalSpent = 0;

	public User(String id, String pw, int money) { // 초기 설정을 위한 생성자, 모두 입력해주어야 작동함.
		this.id = id;
		this.pw = pw;
		this.money = money;
		this.membership = "일반";
		this.totalSpent = 0;
	}

	public User(String id, String pw) { // 신규 가입, 회원가입시 쓸 생성자, 돈은 0원으로 초기화
		this.id = id;
		this.pw = pw;
		this.money = 0;
		this.membership = "일반";
		this.totalSpent = 0;
	}

	public String getMembership() {
		return membership;
	}

	public int getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(int totalSpent) {
		this.totalSpent = totalSpent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void info() { // 유저 정보 출력 ..........
		System.out.printf("%s등급 %s 고객님의 잔고는 %d원입니다.", membership, id, money);
	}

	public void membership() { // 사용한 금액에 따라 멤버쉽 등급 변경.......................
		if (totalSpent >= 150000) {
			this.membership = "골드";
		} else if(totalSpent >=100000) {
			this.membership = "실버";
		} else if(totalSpent >= 50000) {
			this.membership = "브론즈";
		} else {
			this.membership = "일반";
		}
	}
}
