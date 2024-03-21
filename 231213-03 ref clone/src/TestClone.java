
public class TestClone {
	public static void main(String[] args) {
		Toy toy1 = new Toy(1000);
		
//		Toy toy2 = toy1; // 참조 복사 만 일어난다.
		
		Toy toy2 = new Toy(toy1.getPrice()); // 객체 복사 (clone)
		
		Box box = new Box(5, toy1);
//		Box box2 = box; // 참조 복사
	
		// shallow copy 참조값을 그대로 복사
		Box shallow = new Box(box.getSize(), box.getToy());
		
		// deep copy
		Box deep = new Box(box.getSize(), new Toy(toy1.getPrice()));
		System.out.println(box == shallow);
		System.out.println(box.getToy() == shallow.getToy());
		System.out.println(box.getToy() == deep.getToy());
		System.out.println(box.getToy().getPrice() == deep.getToy().getPrice());
	}
}
