import java.util.Scanner;

// 사용자가 자동차의 속도를 결정하고
// 가속/감속 및 속도확인 조작 가능
public class CarSimulation2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car car = new Car();

		System.out.println("자동차의 속도?");
		car.speed = scan.nextInt();
		outer:	
		while (true) {
		
			System.out.println("1. 가속");
			System.out.println("2. 감속");
			System.out.println("3. 현재 속도 확인");

			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.println("얼마만큼?");
				int amount = scan.nextInt();
				car.increaseSpeed(amount);
				break;
			case 2:
				System.out.println("얼마만큼?");
				int amount2 = scan.nextInt();
				car.decreaseSpeed(amount2);
				break;
			case 3:
				System.out.println(car.speed);
				break;
			default:
				System.out.println("잘못된 입력으로 종료");
			    //System.exit(0);
				break outer; 				
			}
		}
	}
}
