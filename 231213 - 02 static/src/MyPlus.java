
public class MyPlus {
	public int plus(int a, int b) {
		return a + b;
	} // 인스턴스 접근을 해야 호출 가능
	
	public static int staticPlus(int a, int b) {
		return a + b;
	} // JVM에 의해서 미리만들어짐
	
	public static void main(String[] args) {
		MyPlus my = new MyPlus();
//		int result = my.plus(100, 200);
//		int result = my.staticPlus(100, 200);
		
		// JVM Class Load 준비하는시점
// 		int result = MyPlus.staticPlus(100, 200);
//		MyPlus.plus(100, 200); //컴파일 에러
		
//		System.out.println(result);
	}
}
