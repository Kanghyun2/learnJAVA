class Person {
	Pen p;
}

public class Pen {
	Person owner;
	
	public static void main(String[] args) {
		Person 도우너 = new Person();
		Pen 모나미 = new Pen();
		
		도우너.p = 모나미;
		모나미.owner = 도우너;
		
//		Pen 제트 = new Pen();
//		
//		도우너.p = 제트;
	}
}
