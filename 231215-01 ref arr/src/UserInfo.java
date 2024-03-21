
public class UserInfo {
	private String name;
	private int age;
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void printAll() {
		System.out.println(name);
		System.out.println(age);
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
