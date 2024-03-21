import java.util.Arrays;

public class ArrPerson2 {
	public static void main(String[] args) {
		Person[] arr = new Person[] { new Person(190, 100), new Person(170, 60), new Person(180, 80),
				new Person(170, 55) 
				};
	
		Arrays.sort(arr, new PersonComparator());
		
		for (Person p : arr) {
			System.out.println(p.getHeight());
			System.out.println("---");
		}
		
		Arrays.sort(arr, new PersonComparator());
		for (Person p : arr) {
			System.out.println(p.getWeight());
			System.out.println("---");
		}
	}
}
