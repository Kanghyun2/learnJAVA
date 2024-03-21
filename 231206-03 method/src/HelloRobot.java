// 다음의 클래스에
// 회수를 정수값 으로 전달받아
// "안녕" 콘솔 출력을 회수만큼 출력하는 메소드 작성
public class HelloRobot {
	int totalCount;
	
	public void printHelloRepeat(int number) {
		for (int i = 0; i < number; i++) {
		System.out.println("안녕");
		}
		totalCount += number;
	}
	
	public static void main(String[] args) {
		HelloRobot robot = new HelloRobot();
		robot.totalCount = 0;
		robot.printHelloRepeat(1);
		System.out.println("추가확인");
		robot.printHelloRepeat(3);
		
		System.out.println(robot.totalCount);
	}
}
