class MyClass {
	public void step1() {

	}

	private void step2() {
		step3();
	}

	private void step3() {
		throw new RuntimeException();
	}
}

public class Main {
	public static void main(String[] args) {
		MyClass my = new MyClass();
		my.step1();

		System.out.println("프로그램 정상 종료");
	}
}
