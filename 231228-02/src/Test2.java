
public class Test2 {
	public static void main(String[] args) {
		Lion l = new Lion(1000, 8);

		l.eatMeat();
		l.getWeight();
		l.getAge();
		
		// 상향형변환 (upcasting)
		Animal a = new Lion(1500, 9);
//		Animal k = new Scanner(System.in);
//		Animal p = "사자";
		// 하향형변환 (down-casting)
		Lion lion = (Lion) a; // 명시적 형변환 필요
	}
}
