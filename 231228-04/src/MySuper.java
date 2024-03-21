class MySub extends MySuper {
	public MySub() {
		super();// 가장 위에 있어야함.
		System.out.println("자식 클래스의 생성자가 호출되었습니다.");
	}

}

public class MySuper {
	public MySuper() {
		System.out.println("부모클래스의 생성자가 호출되었습니다");
	}

	public static void main(String[] args) {
		MySub mysub = new MySub();

	}
}
