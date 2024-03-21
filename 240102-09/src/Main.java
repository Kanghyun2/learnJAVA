// 동물
// 사자, 코끼리, 새
//             오리, 독수리

// 닭 or 타조 or 펭귄

// 날 수 있는 비행기, 날 수 있는 메뚜기

public class Main {
	public static void main(String[] args) {
		Penguin p = new Penguin(100, 10, "빼에에엑");
		System.out.println("펭귄");
		System.out.println("몸무게: " + p.getWeight());
		System.out.println("나이: " + p.getAge());
		System.out.println("울음소리: " + p.getSound());
		p.Birds();
		p.canFly();
		System.out.println("---------------");
		
		Eagle e = new Eagle(70, 5, "끼요요오옷");
		System.out.println("독수리");
		System.out.println("몸무게: " + e.getWeight());
		System.out.println("나이: " + e.getAge());
		System.out.println("울음소리: " + e.getSound());
		e.Birds();
		e.canFly();
		System.out.println("---------------");
		
		Lion l = new Lion(150, 2, "어흥");
		System.out.println("사자");
		System.out.println("몸무게: " + l.getWeight());
		System.out.println("나이: " + l.getAge());
		System.out.println("울음소리: " + l.getSound());
		l.Birds();
		l.canFly();
		System.out.println("---------------");
	}
}
