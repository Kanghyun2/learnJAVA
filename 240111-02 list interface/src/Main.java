import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		
		String[] arr = list.toArray(new String[0]);
		System.out.println("배열 변환 확인: " + Arrays.toString(arr));
		
		List<String> vec = new ArrayList<>();
		vec.add("원소1");
		vec.add("원소2");
		vec.add("원소3");
		
		System.out.println(list.containsAll(vec));
		
		System.out.println(list.equals(vec));

		vec.removeAll(vec); // 원하는 다지움
		
		System.out.println(list.isEmpty());
		
//		System.out.println(vec.get(0));
//		System.out.println(vec.get(1));
//		System.out.println(vec.get(2));
//
//		System.out.println(vec.size());
	}
}
