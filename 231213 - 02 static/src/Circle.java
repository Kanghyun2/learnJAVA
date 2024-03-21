import java.util.Calendar;

public class Circle {
	int radius;
	final static double PI= 3.14; // 전역 변수 / 전체에 영향을줌
	
	public Circle(int radius) {
		this.radius = radius;

	}

	public static void main(String[] args) {
		Circle c = new Circle(5);
		Circle c2 = new Circle(7);
		Circle c3 = new Circle(9);

		System.out.println(Math.PI);
		
//		Circle.pi = 5.5555;
		
		System.out.println(Calendar.YEAR);
	}
}
