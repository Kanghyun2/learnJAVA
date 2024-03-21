
public class TestArray7 {
	// int 배열과 정수 하나를 입력받아
	// 원소중에 찾고자하는 정수가 있는지를 알려주는 정적 메소드 구현
	
	public static boolean contains(int[] target, int value) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == value) {
				return true;
			}
		}
		return false;
	}
	
	// int 배열과 정수 하나를 입력받아
	// 값이 같은 원소의 인덱스를 반환하는 정적 메소드 구현
	public static int findIndex(int[] target, int value) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public static int findIndexReverse(int[] target, int value) {
		for (int i = target.length - 1; i >= 0; i--) {
			if (target[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		boolean result = contains(new int [] { 9, 7, 6, 3, 2}, 3);
		System.out.println(result);
		
		int index = findIndex(new int[] { 10, 9, 8, 7, 7 }, 7);
		System.out.println(index);
		
		int index2 = findIndexReverse(new int[] { 10, 9, 8, 7, 7 }, 7);
		System.out.println(index2);
	}
}
