
// 자동차
// 속도
// 색깔
// 가속
// 감속
class Car {
	private int speed;
	private String color;

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
	}
	public void increaseSpeed() {
		speed++;
	}
	public void decreaseSpeed() {
		speed--;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
// 스포츠카
// 터보 기능 유무
// 속도
// 가속
// 감속
class SportCar extends Car {
	private boolean hasTurbo;
		
	public SportCar(int speed, String color, boolean hasTurbo) {
		super(speed, color);
		this.hasTurbo = hasTurbo;
	}
	public boolean isHasTurbo() {
		return hasTurbo;
	}
	public void setHasTurbo(boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}

}
// 트럭
// 최대 적재 중량
// 속도
// 가속
// 감속
class Truck extends Car {
	private int maxWeight;

	public Truck(int speed, String color, int maxWeight) {
		super(speed, color);
		this.maxWeight = maxWeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
}

public class Main {
	public static void main(String[] args) {
		Truck t = new Truck(0, "초록색", 1000);
		t.increaseSpeed();
		t.decreaseSpeed();
		t.decreaseSpeed();
		System.out.println(t.getMaxWeight());
		System.out.println(t.getSpeed());
		System.out.println(t.getColor());
	}
}
