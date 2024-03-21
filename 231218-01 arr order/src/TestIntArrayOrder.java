import java.util.Arrays;

public class TestIntArrayOrder {
	public static void main(String[] args) {
		// 학생들의 점수를 기록한 정수 배열
		int[] scores = { 10, 30, 20, 90, 70 };
		int[] sorted = Arrays.copyOf(scores, 5);
		
		Arrays.sort(sorted); // 학생 점수 배열, 정렬된 배열 만듬
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sorted));

		int index = Arrays.binarySearch(sorted, 70); // 이진 검색, 정렬 되어 있어야만 함.
		System.out.println(index);
		
//		if (scores[1] > scores[2]) {
//		int temp = scores[1];
//		scores[1] = scores[2];
//		scores[2] = temp;
//		}
		
		// 최대 점수
//		int max = 0;
//		for (int i = 0; i < scores.length; i++) {
//			if (scores[i] > max) {
//				max = scores[i];
//			}
//		}
//		System.out.println(max);
//		// 최소 점수
//		int min = 100;
//		for (int i = 0; i < scores.length; i++) {
//			if(scores[i] < min) {
//				min = scores[i];
//			}
//		}
//		System.out.println(min);
//		// 중위 점수
		
	}
}
