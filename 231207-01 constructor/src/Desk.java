// 책상
// 모델명 : String
// 가격 : int
// 높이조절여부 " boolean

// 생성자 정의
// String 모델명, int 가격, boolean 높이조절여부) 모든 필드 초기화
// (String 모델명, int 가격) << 높이조절여부 true
public class Desk {
	String name;
	int price;
	boolean high;

	public Desk(String n, int a, boolean b) {
		name = n;
		price = a;
		high = b;
		System.out.println("3개 파라미터를 전달받는 생성자로 책상이 생성되고 모든 필드가 초기화됨..");
	}

	public Desk(String n, int a) {
		name = n;
		price = a;
		high = true;

	}

	public static void main(String[] args) {
		Desk d = new Desk("black", 1000);
		System.out.println(d.name);
		System.out.println(d.price);
		System.out.println(d.high);

		Desk d2 = new Desk("white", 2000, false);
		System.out.println(d2.name);
		System.out.println(d2.price);
		System.out.println(d2.high);

	}
}
