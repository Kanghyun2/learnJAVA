public class StaticVariable {
	int mynum = 300;
	static int yournum = 500; // 클래스이름.yournum 호출/ 정적 변수

	public static void main(String[] args) {
		StaticVariable a = new StaticVariable();
		System.out.println(a.mynum);
		
	//	System.out.println(yournum);
		System.out.println(StaticVariable.yournum);
	}
}
