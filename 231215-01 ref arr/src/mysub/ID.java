package mysub;

public class ID {
	private String id;
	private String password;
	private int money;
	
	public ID(String id, String password, int money) {
		this.id = id;
		this.password = password;
	}
	public boolean match(String id, String password) {
		return this.id.equals(id) && this.password.equals(password);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
}
