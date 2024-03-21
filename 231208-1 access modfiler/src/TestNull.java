
public class TestNull {
	public static void main(String[] args) {
		String s = null; // s : 참조값이 없음을 나타내는 값 // s : null(값) 을  참조 

//		String empty = "";
//		System.out.println(empty.length());

//		String nonInit;
//		System.out.println(nonInint);
		
//		nonDecl = "값";
//		System.out.println(nonDecl);
		
		// 1. s의 값을 올바르게 초기화함.
//		s = "의도한 문자열값";
		
		// 2. s의 참조가 올바를 때만 접근함.
		if (s != null) { // 참조값 비교
			System.out.println(s.length());
		}
//		System.out.println(s.length());
//		NullPointerException
	}
}
