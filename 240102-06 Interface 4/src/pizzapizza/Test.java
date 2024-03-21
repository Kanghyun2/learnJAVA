package pizzapizza;

public class Test {
	public static void main(String[] args) {
		Pizza pep = new PepperoniPizza(10);
		Pizza bacon = new BaconPizza(200);
		
		System.out.println(pep.getPrice());
		System.out.println(bacon.getPrice());
		
		
		System.out.println(pep.compareTo(bacon));
	}
}
