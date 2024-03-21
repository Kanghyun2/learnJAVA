//extends 상속 
public class Lion extends Animal {
	public Lion(int weight, int age) {
		super(weight, age);
	}
	
	public void eatMeat() {
		System.out.println("사자는 육식을 합니다.");
	}
}
