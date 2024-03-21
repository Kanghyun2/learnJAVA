
public class Circle {
	private Point2D center;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		center = new Point2D(x, y);
		this.radius = radius;
	}
	public String toString() {
		return String.format("(x: %d, y: %d) 반지름: %d", center.getX(), center.getY(), radius);
	}
	public Point2D getCenter() {
		return center;
	}
	public void setCenter(Point2D center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
