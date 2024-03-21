import java.util.ArrayList;

public class Main3 {
	public static void main(String[] args) {
		// 정수 원소 1, 2, 3을 가지는 ArrayList 생성하기
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); // auto-boxing 객체의 형태로 
		list.add(2); 
		list.add(Integer.valueOf(3));

		int firstElem =list.get(0); // unboxing 자동
		System.out.println(firstElem);
		
		System.out.println(list.size());
		
		list.clear();
		
		System.out.println(list.size());
	}
}
