public class InitArray3 {
	public static void main(String[] args) {
//	int	number = 22;
		// 초기화 하고자하는 배열의 각 원소들의 값, 순서가 있는경우.
		int[] arr = new int[] { 30, 40, 50, 60 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int[] arr2 = { 70, 80, 90 };

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3; // 선언 후 에 
//		arr3 = { 100, 110, 120 };
		arr3 = new int[] { 100, 110, 120 };
		
		// 정수 int 원소 13, 24, 66, 89를 순서대로 가지는 배열 선언과 초기화.
//		int[] arr4 = new int[4];
//		arr[0] = 13;
//		arr[1] = 24;
//		arr[2] = 66;
//		arr[3] = 89;
//      int[] arr4 = new int[] { 13, 24, 66, 89 };
		int[] arr4 = { 13, 24, 66, 89 };
	}
}
