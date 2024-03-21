public class Eagle extends Bird {
    public Eagle(int weight, int age) {
		super(weight, age);
	}
    public void canHunt() {
    	System.out.println("독수리는 사냥을 할 수 있음");
    }
	@Override
	public void printSound() {
		System.out.println("빼에엑");
	}
}
