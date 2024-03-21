
public class Magazine extends Book {
	private String date;

	public Magazine(String title, int pages, String name, String date) {
		super(title, pages, name);
		this.date = date;
	}
	@Override // annotation
	public void printAll() {
		super.printAll();
		System.out.println("발매일: " + date);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
