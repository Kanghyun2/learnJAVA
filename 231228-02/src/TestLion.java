
public class TestLion {
	public static void main(String[] args) {
		// 객체들은 다형성을 가질수있다 .
		Lion l = new Lion(1500, 7);

		System.out.println("사자의 무게: " + l.getWeight());
		System.out.println("사자의 나이: " + l.getAge());
		l.eatMeat();

		Elephant e = new Elephant(4000, 11);
		System.out.println("코끼리 무게: " + e.getWeight());
		System.out.println("코끼리 나이: " + e.getAge());
		e.eatHay();

		Animal a = new Animal(3000, 4);
		a.setWeight(3500);
		a.setAge(7);
	}
}
