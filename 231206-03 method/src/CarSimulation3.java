
public class CarSimulation3 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.speed = 0;
		car1.increaseSpeed(10);
		Car car2 = new Car();
		car2.speed = 10;
		car2.increaseSpeed(100);
		Car car3 = new Car();
		car3.speed = 20;
		car3.increaseSpeed(50);
		
		System.out.println(car1.speed);
		System.out.println(car2.speed);
		System.out.println(car3.speed);
		
	}

}
