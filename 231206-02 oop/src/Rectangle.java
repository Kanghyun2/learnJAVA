// 직사각형 클래스 정의
// 가로(int)
// 세로(int)
// 넓이를 구해 콘솔에 출력 기능 - (public void ???() {} -
public class Rectangle {
	int width;
	int height;
	
	public void printPerimeter() {
		System.out.println("직사각형의 둘레: " + 2 * (width + height));
		
	}
	
	public void printArea() {
		System.out.println("직사각형의 넓이: " + (width * height));
	}
}
