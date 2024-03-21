public class TestClone2 {
	public static void main(String[] args) {
		int number = 22;
		int copyNumber = number;
		
//		Toy toy = new Toy(22);
//		Toy sameRef = toy;
//		
//		Toy copy = new Toy(toy.getPrice());
		
		Box box = new Box(3, new Toy(33));
//		Box sameRef = box;
		Box shallowcopy = new Box(box.getSize(), box.getToy());// 표면적인 복사
		
		Box deepCopy = new Box(box.getSize(), new Toy(33));
	}
}
