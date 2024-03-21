
// 2차원 평면상의 직사각형
// 좌표 x, y
// 가로, 세로
public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int newX, int newY, int w, int h) {
		x = newX;
		y = newY;
		width = w;
		height = h;
	}
	
	// Overload (파라미터의 개수, 자료형, 순서)로 찾아감
	public Rectangle(int w, int h) {
		x = 0;
		y = 0;
		width = w;
		height = h;
	}
	
	
	
	public static void main(String[] args) {
        // 사각형의 생성자를 정의한 경우, 기본 생성자가 없어짐
		Rectangle r = new Rectangle(10, 10, 20, 30);
		System.out.println(r.x);
		System.out.println(r.y);
		System.out.println(r.width);
		System.out.println(r.height);
		
		Rectangle r2 = new Rectangle(10, 15);
		System.out.println(r2.x);
		System.out.println(r2.y);
		System.out.println(r2.width);
		System.out.println(r2.height);
		Rectangle r3 = new Rectangle(20, 25);
		
		Rectangle r4 = new Rectangle(40, 45);
		
		
//		Rectangle r = new Rectangle();
//		r.x = 10;
//		r.y = 10;
//		r.width = 20;
//		r.height = 30;
//		
//		Rectangle r2 = new Rectangle();
//		r2.x = 0;
//		r2.y = 0;
//		r2.width = 10;
//		r2.height = 15;
		
	} 
}
