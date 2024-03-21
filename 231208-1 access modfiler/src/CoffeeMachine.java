// 커피 기계
// 커피 가루 준비
// 물 끓임
// 커피 완성
public class CoffeeMachine {
	public void readyCoffeePowder() {
		System.out.println("커피 가루 준비");
	}
	
	public void boilWater() {
		System.out.println("물끓임");
	}
	
	public void completeCoffee() {
		System.out.println("커피 완성");
	}
	
	public void process() {
		readyCoffeePowder();
		boilWater();
		completeCoffee();
	}
}
