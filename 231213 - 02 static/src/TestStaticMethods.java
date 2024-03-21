
public class TestStaticMethods {
	int a = 100;
	int b = 200;

//	public static int test() {
//		return a + b;
//	}

	// 상태값과 무관하게 결과를 반환할 수 있는 메소드
	// 정적변수(상수) 또는 파라미터만을 사용
	
	public static void main(String[] args) {
		int abs = Math.abs(-100); 
		System.out.println(abs);
		
		double ceil = Math.ceil(12.12); // 실수값에 근접한 반올림
		System.out.println(ceil);
		
		double floor = Math.floor(12.12); 
		System.out.println(floor);
		
		double round = Math.round(12.12);
		System.out.println(round);
		
		int max = Math.max(10, 20); // 두개의 값중 큰값을 출력함
		System.out.println(20);
		
		int max2 = Math.max(10, Math.max(20, 30));
		System.out.println(max2);
		
		double pow = Math.pow(2, 4); // 제곱을 구하는 메소드
		System.out.println(pow);
		
		double r = Math.random(); // 1보다 작은 실수의 랜덤한값 을 출력
		System.out.println(r);
		
		int num = (int) (Math.random() * 45); // 정수 0부터 44 랜덤 
		System.out.println(num);
	}
}
