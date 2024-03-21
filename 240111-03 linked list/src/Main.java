import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		
		System.out.println(list.size());
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
	}
}
