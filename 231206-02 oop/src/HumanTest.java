public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "길동";
		h.age = "1";
		h.sayHello();
		
		
		Human h2 = new Human();
		h2.name = "둘리";
		h2.age = "2";
		h2.sayHello();
		
		System.out.println("프로그램 종료");
	}
}
