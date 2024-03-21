import java.util.Arrays;
import java.util.Scanner;

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
public class QHistogram {
	// 10개 정수
	private int[] histogram;
	private Scanner scan;
	
	public QHistogram() {
		histogram = new int[10];
		scan = new Scanner(System.in);
	}
	// 10개 정수 입력받기
	private void inputNumbers() {
		System.out.println("10개 정수를 입력하세요.");
		for (int i = 0; i < histogram.length; i++) {
			plusCount(scan.nextInt());
		}
	}
	
	// 개수 늘리기
	private void plusCount(int number) {
		int index = (number - 1) / 10;
		histogram[index]++;
	}
	
	private void printRange(int num) {
		int start = (num * 10) + 1;
		int end = (num + 1) * 10;
		System.out.print(start + " ~ " + end + " )");
	}
	
	private void printStar(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	private void printHistogram() {
		for (int i = 0; i < histogram.length; i++) {
			printRange(i);
			printStar(histogram[i]);
		}
	}
	
	// 기록된 개수 보여주기
	private void printTest() {
		System.out.println(Arrays.toString(histogram));
	}
	
	public void startProgram() {
		inputNumbers();
		printHistogram();
	}
	
	public static void main(String[] args) {
		QHistogram h = new QHistogram();
		h.startProgram();
	}
}









