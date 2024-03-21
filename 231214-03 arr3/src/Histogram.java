
//2. 분포도 (히스토그램)
// - 사용자에게 1 ~ 100 사이의 정수를 10번 입력받아서
//   각 범위의 수의 분포를 보여줄 수 있는 프로그램
//   입력예) 1 5 9 7 15 20 30 41 49 50
//   출력예)
//        1 ~ 10) ****
//       11 ~ 20) **
//       21 ~ 30) *
//       31 ~ 40)
//       41 ~ 50) *
//		.....
//       81 ~ 90)
//       91 ~ 100)
import java.util.Scanner;

public class Histogram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 100사이 정수 10번 입력");
		int[] arr = new int[10];
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;

		for (int i = 0; i < 10; i++) {
			int input = scan.nextInt();
			if (input >= 1 && input <= 10) {
				arr[count] = input;
				count++;
			} else if (input >= 11 && input <= 20) {
				arr[count1] = input;
				count1++;
			} else if (input >= 21 && input <= 30) {
				arr[count2] = input;
				count2++;
			} else if (input >= 31 && input <= 40) {
				arr[count3] = input;
				count3++;
			} else if (input >= 41 && input <= 50) {
				arr[count4] = input;
				count4++;

			} else if (input >= 51 && input <= 60) {
				arr[count5] = input;
				count5++;

			} else if (input >= 61 && input <= 70) {
				arr[count6] = input;
				count6++;

			} else if (input >= 71 && input <= 80) {
				arr[count7] = input;
				count7++;

			} else if (input >= 81 && input <= 90) {
				arr[count8] = input;
				count8++;

			} else if (input >= 91 && input <= 100) {
				arr[count9] = input;
				count9++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
		System.out.println(count7);
		System.out.println(count8);
		System.out.println(count9);

	}
}