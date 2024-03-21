public class TestString {
	public static void main(String[] args) {
		// 문자열은 "불변"의 객체이다.
		// StringPool에 보관된다. String 들이 모여있는 
		String origin = "원본문자열";
		String sameValue = "원본문자열";
		String sameRef = origin;
		
		System.out.println(origin == sameValue);
		System.out.println(origin == sameRef);
		System.out.println(sameRef);
		

//		Person person = new Person(10);
//		Person samePerson = person;
//		
//		Person anotherPerson = new Person(10);
//		
//		System.out.println(person == samePerson);
//		System.out.println(person == anotherPerson);
//		
//		anotherPerson = null; // 참조를 잃어버린 인스턴스 = 쓰레기(garbage) 다시 찾을수 없음 / 값을 잃어버림
//		
//		samePerson = null; // person
//		
		// JVM. Garbage Collector 언제동작할지 예측 힘듬 (프로그램 동작 도중) 
	}
}
