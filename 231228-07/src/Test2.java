// 삼각형
// 높이
// 밑변
// 넓이 출력 가능

// 직사각형
// 가로
// 세로
// 넓이 출력 가능

// 원
// 반지름
// 넓이 출력 가능
public class Test2 {
	public static void main(String[] args) {
		Triangle t= new Triangle(100, 100);
		t.printArea();
		
		Rectangle r = new Rectangle(100, 100);
		r.printArea();
		
		Circle c = new Circle(10);
		c.printArea();
		
		Shape[] arr = new Shape[] { t, r, c };
		for (Shape s : arr) {
			s.printArea();
		}
	}
}
