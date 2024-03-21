// 동물
// 종
// 나이
// 체중

// 모든 필드 초기화 생성자와
// 각각의 필드의 접근자, 설정자 쌍
public class Animal {

	private String type;
	private int age;
	private double weight;

	public Animal(String animal, String type, int age, int weight) {

		this.type = type;
		this.age = age;
		this.weight = weight;
	}

	public void setType(String type) {
		this.type = type;

	}

	public String getType() {
		return type;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
}
