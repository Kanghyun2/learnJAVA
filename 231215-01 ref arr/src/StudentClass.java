public class StudentClass {

	private Student[] students;
	
	public StudentClass(Student[] students) {
		this.students = students;
	}
	
	public void printTotalAVG() {
		int sum = 0;
		for (int i = 0; i < students.length; i++) {
			sum += students[i].getSum();
			
		}
		System.out.println("학급평균: " + sum / students.length); 
	}
	public void printAllScores() {
		for (Student s : students) {
			System.out.println(s.toString());
		}
}
}
