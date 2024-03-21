public class PersonEquals {
	public static void main(String[] args) {
		Person dooli = new Person("둘리", 22);
		Person sameRef = dooli;
		Person dooli2 = new Person("둘리", 22);

//		System.out.println(dooli == sameRef);
//		System.out.println(dooli == dooli2);
		
		System.out.println(dooli.equals(dooli2)); // Object 의 기능을 그대로 물려받앗기때문에 참조가 다른경우 false
		
		System.out.println(dooli.equals("문자열"));
	}
}
