
public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("이름: %s, 나이: %d", name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
		Person target = (Person) obj;
		
		return this.name.equals(target.name) && this.age == target.age;
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
