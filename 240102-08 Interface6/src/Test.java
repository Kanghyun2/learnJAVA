
interface MyInterface {
//	public default void someMethod() { // default 기본 동작
//		System.out.println("완성된 메소드");
//	}
	public void someMethod();
}

class MyImpl implements MyInterface {

	@Override
	public void someMethod() {
		System.out.println("완성된 메소드");		
	}
}

class yourImpl implements MyInterface {
	@Override
	public void someMethod() {
		System.out.println("완성된 메소드");		
	}
}

class TheirImpl implements MyInterface {

	@Override
	public void someMethod() {
		System.out.println("재정의된 메소드");
	}
}

public class Test {
	public static void main(String[] args) {

	}
}