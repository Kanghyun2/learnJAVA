public class CopyArray {
	public static void main(String[] args) {
		int[] numbers = { 20, 22, 26, 30 };
		
		// 원본 배열과 타입, 길이, 원소 값, 순서가 같은 배열을 생성하기
		int[] copy = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			copy[i] = numbers[i];
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(copy[i]);
		}
		
		
		//copy[0] = numbers[0];
		//copy[1] = numbers[1];
		//copy[2] = numbers[2];
		//copy[3] = numbers[3];
	
		
//		int[] anotherRef = numbers;
		//
		//numbers[0] = 90;
		
		//	for (int i = 0; i < numbers.length; i++) {
		//System.out.println(numbers[i]);
			//	}
		//System.out.println();
		//	for (int i = 0; i < anotherRef.length; i++) {
		//	System.out.println(anotherRef[i]);
			
		}
	}

