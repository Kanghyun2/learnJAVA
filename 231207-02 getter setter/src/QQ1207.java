// 상자 클래스
// 가로
// 세로
// 높이
// 모든 필드 초기화 생성자
// 부피를 구해 반환할 수 있는 메소드
public class QQ1207 {
	// 접근제한자
	// private 외부의 모든 접근(가시성)을 제한
	private int width;
	private int length;
	private int heigth;
	
	public QQ1207(int width, int length, int heigth) {
		this.width = width;
		this.length = length;
		this.heigth = heigth;
	}
	// 접근제한자
	// public 모든 접근(가시성)을 허용
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}
	public int getHeigth() {
		return heigth;
	}
	
	public void setWidth(int width) {
		if(width >= 0) {
			this.width = width;	
		}
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int volume() {
		return width * length * heigth;
		  
	}
	public void printAll () {
		System.out.println("가로" + width);
		System.out.println("세로" + length);
		System.out.println("높이" + heigth);
	}
	
		
	public static void main(String[] args) {
		QQ1207 q = new QQ1207(30, 20, 10);
	    q.printAll();
		System.out.println("상자의 부피: " + q.volume());
		q.setWidth(-300);
		System.out.println(q.getWidth());
		
		q.width = 300;
		System.out.println(q.width);
	}
}
