
public class Main {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(10);
		
		// Auto-Boxing 자동적인 포장.
		Integer box = 100;
		
		int primitive = i.intValue();
		
		int unbox = box;
		
		Object o = 100;
		
		System.out.println(o.toString());
		
//		System.out.println(100.toString()); XXXXXXXXXXX		
	}
}
