import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Collection
		
		// index를 활용하여 순차적으로 접근 가능 
		// 동적인 size 원하는 만큼 추가해서 사용가능
		// <> 제네릭(generic)
		ArrayList<String> list = new ArrayList<String>();
		list.add("원소1"); // 삽입 (insert)
		list.add("원소2");
		list.add("원소3");
		
		System.out.println("크기: " + list.size());
//		System.out.println(list.toString());
	
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}
}
