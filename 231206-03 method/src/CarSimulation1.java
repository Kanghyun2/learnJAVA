
public class CarSimulation1 {
	public static void main(String[] args) {
		// 속도를 가지는 자동차를 만들고
		Car car = new Car();
		car.speed = 10;
		// 가속도 해보고
		car.increaseSpeed(30);
		// 감속도 해보고
		car.decreaseSpeed(20);
		// 현재 속도 확인
		System.out.println(car.speed);
	}
}
