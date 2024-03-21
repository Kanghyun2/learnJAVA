// 컵
// 색깔
// 용량
// 손잡이 유무

// 모든 필드 초기화 생성자
// 색깔만 전달받아서 초기화하는 생성자 { 용량의 값은 200, 손잡이는 없음 }
public class Cup {
	String color;
	int volume;
	boolean hasHandle;
	public Cup(String color, int volume, boolean hasHandle) {
		this.color = color;
		this.volume = volume;
		this.hasHandle = hasHandle;
	}
	public Cup(String color) {
		this(color, 200, false);
	}
	public static void main(String[] args) {
		
		Cup c = new Cup("빨강" , 100, false);
		Cup c2 = new Cup("빨강");
		System.out.println(c2.color);
		System.out.println(c2.volume);
		System.out.println(c2.hasHandle);
	}
}
