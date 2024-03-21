
public class TestAnimal {
	public static void main(String[] args) {
		// 사자, 코끼리
		Animal lion = new Animal( 150, 7);
		Animal elephant = new Animal( 4000, 11);
		
		// 사자는 고리를 먹을 수 있음.
		lion.eatMeat();
		// 코끼리는 건초를 먹을 수 있음.
		elephant.eatHay();
		
		elephant.eatMeat();
		
		Elephant e = new Elephant(null, 5000, 12);
//		e.eatMeat();
		e.eatHay();
	}
}
