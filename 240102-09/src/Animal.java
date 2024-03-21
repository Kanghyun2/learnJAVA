
public class Animal {
	private int weight;
	private int age;
	private String sound;

	public Animal(int weight, int age, String sound) {
		super();
		this.weight = weight;
		this.age = age;
		this.sound = sound;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
}
class Penguin extends Animal implements Fly, Bird {

	public Penguin(int weight, int age, String sound) {
		super(weight, age, sound);
	}
	public void canFly() {
		System.out.println("날수 없음");
	}
}
class Eagle extends Animal implements Fly, Bird {

	public Eagle(int weight, int age, String sound) {
		super(weight, age, sound);

	}
}
class Lion extends Animal implements Fly, Bird {

	public Lion(int weight, int age, String sound) {
		super(weight, age, sound);
	}
	public void canFly() {
		System.out.println("날수 없음");
	}
	public void birds() {
		System.out.println("새 아님");
	}
}

