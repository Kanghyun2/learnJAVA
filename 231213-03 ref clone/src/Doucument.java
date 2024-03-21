
public class Doucument {
	String name;
	String date;
	String detail;
	int importance;

	public Doucument(String name, String date, String detail, int importance) {
		super();
		this.name = name;
		this.date = date;
		this.detail = detail;
		this.importance = importance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getImportance() {
		return importance;
	}

	public void setImportance(int importance) {
		this.importance = importance;
	}

}
