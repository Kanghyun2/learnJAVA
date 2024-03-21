import java.util.Arrays;

public class TestPizza {
	public static void main(String[] args) {
		
		Pizza p = new Pizza(10000, "기본 피자");
		Pizza p1 = new Pepperoni(10000, "페페로니 피자", 20);
		Pizza p2 = new Bacon(10000, "베이컨 피자", 80);
		
//		System.out.println(p.getPrice());
//		System.out.println(p1.getPrice());
//		System.out.println(p2.getPrice());
		
		Pizza [] arr = { p, p1, p2 };
		Arrays.sort(arr);
		
		for(Pizza elem : arr) {
			System.out.println(elem);
		}
	}
}
