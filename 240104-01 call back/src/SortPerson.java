import java.util.Arrays;
import java.util.Comparator;

public class SortPerson {
	public static void main(String[] args) {
		Person[] arr = {
				new Person(180, 80)
				, new Person(190, 85)
				, new Person(160, 70)
				, new Person(190, 75)
		};
		Comparator<Person> height = new Comparator<Person>() { // 익명 (anonymous) class
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getHeight() - o2.getHeight();
			}
		};
		Arrays.sort(arr, height);
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getWeight() - o2.getWeight();
			}
		});
		
		System.out.println(Arrays.toString(arr));
	}
}

