// 작가
// (글을 적을 수 있는 도구가 필요(가지고 있어야)하다)
// 글을 적을 수 있음
class Author {
	// 객체 의존성
	private Writeable tool;

	public Author(Writeable tool) {
		super();
		this.tool = tool;
	}
	
	public void writeArticle() {
		tool.write("책 내용");
	}

	public void setTool(Writeable tool) {
		this.tool = tool;
	}
}

interface Writeable {
	public void write(String line);
}

// 연필
// 문자열 콘솔 출력 가능
class Pencil implements Writeable {

	@Override
	public void write(String line) {
		System.out.println("연필로" + line + " 적습니다.");
	}
}
// 볼펜
// 문자열 콘솔 출력 가능
class BallPen implements Writeable {

	@Override
	public void write(String line) {
		System.out.println("볼펜으로" + line + "적습니다.");
	}
}
public class Main {
	public static void main(String[] args) {
		Writeable pencil = new Pencil();
		Writeable ballpen = new BallPen();
		Author author = new Author(pencil);
		author.writeArticle();
		
		author.setTool(ballpen);
		author.writeArticle();
	}
}
