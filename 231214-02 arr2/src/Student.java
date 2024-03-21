// 학생
// 점수(int)를 3개 가집니다.
// 이름
public class Student {
	int[] score;
	String name;

	public Student(int s1, int s2, int s3, String name) {
//		score = new int[3];
//		score[0] = s1;
//		score[1] = s2;
//		score[2] = s3;

		score = new int[] { s1, s2, s3 };
		this.name = name;
	}

	public Student(int[] score, String name) {
		int[] temp = new int[3];                  // 길이값 3개 안으로 출력할때  그 이상은 출력 오류
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 0;
		}
		for (int i = 0; i < score.length && i < temp.length; i++) { // 출력 3개까지만
			temp[i] = score[i];
		}
		this.score = temp;
		this.name = name;
	}

	public void printAll() {
		System.out.println(name);
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
