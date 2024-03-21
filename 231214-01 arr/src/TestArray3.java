import java.util.Scanner;

// 사용자에게 5개의 정수를 입력받아
// 2자리 정수의 개수와 합을 출력
// 탐색한 원소들을 나열.
public class TestArray3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[5];
		int count = 0;
		System.out.println("5개의 정수 입력.");
		for (int i = 0; i < arr.length; i++) {
			int input = scan.nextInt();
			arr[i] = input;
			if (arr[i] >= 10 && arr[i] <= 99)
				sum += arr[i];
			count++;
		}
		System.out.println(sum);
		System.out.println(count);

		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			if (n >= 10 && n <= 99) {
				System.out.println(n);

			}
		}
	}
}
