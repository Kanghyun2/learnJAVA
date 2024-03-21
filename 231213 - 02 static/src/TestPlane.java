import plane.Plane;

// 비행기를 나타내는 Plane 클래스를 작성
// 비행기는
// 제작사("보잉", "에어비스" 등의 값을 가짐)
// 모델("A380", "Boeing757" 등)
// 최대승객수(300, 200 등)

// 각 필드 정의 및 private 접근 제한자 설정
// public 생성자 및 getter/setter

// 생성자 정의
// (String, String, int)
// (String, String) => int값 전달이 없을 경우, 최대 승객수는 250명이다

// main 메소드를 포함한 테스트 클래스에서 객체 생성
// 생성된 인스턴스의 수를 나타낼 수 있는 변수(count)를 선언하고, 인스턴스 생성시 1씩 증가한다.
// 여러개의 인스턴스 생성 후, planeCount 값을 출력해서 확인

// 음속의 값을 어디서든지 접근이 가능한 변하지않는 값
public class TestPlane {
	public static void main(String[] args) {
		// 생성 1
		Plane plane1 = new Plane("a380", "에어버스", 300);
		System.out.println(plane1.getModel());	
		// 생성2
		Plane plane2 = new Plane("Boeing747", "보잉", 200);
		// 생성3
		Plane plane3 = new Plane("DC10", "맥도널더글라스");
		System.out.println("생성된 비행기 수: " + Plane.planeCount);
		System.out.println("음속: " + Plane.SPEED_OF_SOUND);
	}
}
