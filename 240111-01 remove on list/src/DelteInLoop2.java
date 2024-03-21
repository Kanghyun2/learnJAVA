import java.util.ArrayList;
import java.util.Iterator;

public class DelteInLoop2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cat");
		list.add("dog");
		list.add("eagle");

		// ** List 에서 원하는 원소 삭제할때는 iterator 가 짱
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String elem = iterator.next();
			if (elem.length() == 3) {
				iterator.remove();
			}
		}
		System.out.println(list);

//		for (String elem : list) {
//			if (elem.length() == 3) {
//				list.remove(elem);
//			}
//		}

	}
}
