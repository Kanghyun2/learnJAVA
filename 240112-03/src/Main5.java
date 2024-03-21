import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// 학원 수강생 관리 프로그램

// 영어반, 수학반

// 같은 과목에 중복 등록 불가
// 각 반은 총원이 3명
class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Set<Student>> engList = new ArrayList<>();
		List<Set<Student>> mathList = new ArrayList<>();

		Set<Student> eng = new HashSet<>();
		Set<Student> math = new HashSet<>();

		boolean go = true;

		while (go) {
			System.out.println("등록하고싶은 과목   영어/수학");
			String subject = scan.nextLine();
			if (subject.equals("1")) {
				break;
			}
			System.out.println("이름");
			String name = scan.nextLine();
			Student student = new Student(name);
			
			if (subject.equals("수학")) {
				if (!eng.contains(student)) {
					math.add(new Student(name));
				} else {
					System.out.println("이미 영어 과목 수강중");
				}
			}

			if (subject.equals("영어")) {
				if (!math.contains(student)) {
					eng.add(new Student(name));
				} else {
					System.out.println("이미 수학 과목 수강중");
				}
			}

			if (math.size() == 3) {
				mathList.add(math);
				math = new HashSet<>();
			} else if (eng.size() == 3) {
				engList.add(eng);
				eng = new HashSet<>();
			}

		}
		System.out.println("현재 수학 과목 수강중인 학생 :" + math);
		System.out.println("수학 과목 수강했던 학생들 : " + mathList);
		System.out.println("현재 영어 과목 수강중인 학생 :" + eng);
		System.out.println("영어 과목 수강했던 학생들 : " + engList);
	}
}
