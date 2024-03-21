
public class Book {
	private String title;
	private int pages;
	private String name;

	public Book(String title, int pages, String name) {
		super();
		this.title = title;
		this.pages = pages;
		this.name = name;
	}

	public void printAll() {
		System.out.println("-------------");
		System.out.println("제목: " + title);
		System.out.println("페이지수: " + pages);
		System.out.println("저자명: " + name);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
