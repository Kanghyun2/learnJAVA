
public class Test {
	public static void main(String[] args) {
//		MyInterface my = new MyInterface();
//		MyKoreanPrinter kor = new MyKoreanPrinter();
//		MyEnglishPrinter eng = new MyEnglishPrinter();
		
		//kor.printHello();
		//eng.printHello();
		
//		Speakable i = kor;
//		i.printHello();
//		
//		i = eng;
//		i.printHello();
		
		Person kp = new KoreanPerson("길동");
		Person ep = new EnglishPerson("dd");
		System.out.println(kp.toString());
		System.out.println(ep.toString());
		
// 		kp.printHell();
//		KoreanPerson kor = (KoreanPerson) kp;
//		kor.printHello();

		Speakable s = (Speakable) kp;
		s.printHello();
		
		s = (Speakable) ep;
		s.printHello();
		
	}
}
