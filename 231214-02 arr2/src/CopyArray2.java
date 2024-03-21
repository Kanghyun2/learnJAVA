public class CopyArray2 {
	public static void main(String[] args) {
		int[] numbers = { 20, 22, 26, 30 };

		// 위의 배열에서 앞 2개만을 원소로 가지는 배열 생성
		int[] less = new int[2];
		for (int i = 0; i < less.length; i++) {
			less[i] = numbers[i];
		}
		for (int i = 0; i < less.length; i++) {
			System.out.println(less[i]);
		}
		int [] reverse = new int[2];
		for (int i = 0, j = reverse.length - 1; i < reverse.length; i++, j--) {
			reverse[i] = numbers[j];
		}
		
		for (int i = 0; i < reverse.length; i++) {
			System.out.println(reverse[i]);
		}
	}
}
