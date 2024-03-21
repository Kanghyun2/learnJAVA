
public class CalculatorTest {
	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator();
		int sum = cal.plus(100, 200);
		System.out.println(sum);
		
		int result = cal.minus(800, 200);
		System.out.println(result);
		
		int range = cal.getSumFromZero(100);
		System.out.println(range);
		
		System.out.println("프로그램 종료");
	}
}
