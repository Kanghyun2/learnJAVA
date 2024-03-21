import java.util.Arrays;

public class ArrStudent {
	public static void main(String[] args) {
		Student[] arr = new Student[] { 
				new Student("홍길동", 50)
				, new Student("둘리", 100)
				, new Student("고길동", 70) 
		};
	
//		int result = "문자열".compareTo("abc");// 문자열 대소비교 .compareTo
//		System.out.println(result);
		
		// 학생의 이름으로 오름차순 정렬 완성해보기
		Arrays.sort(arr, new StudentNameComprator());
		
		for (Student s : arr) {
			System.out.println(s.getName());
			System.out.println(s.getScore());
			System.out.println(("---"));
		}
	}
}
