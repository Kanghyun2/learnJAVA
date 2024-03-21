public class Duck extends Bird {
	public Duck(int weight, int age) {
		super(weight, age);
	}
	
	
	public void canWeeping() {
		System.out.println("오리는 꽥꽥 소리를 냄");
	}


	@Override
	public void printSound() {
		System.out.println("꽥 꽥");
		
	}

}
