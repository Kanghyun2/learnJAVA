class MySuper {
	private void print() {
		System.out.println("출력");
	}

	void hi() {
		System.out.println("하이");
	}

	protected void hello() {
		System.out.println("헬로");
	}
}

class MySub extends MySuper {
		@Override
		void hi() {
			System.out.println("재정의 하이");
		}
//		@Override
//		private void print()
	}


public class Main2 {
	public static void main(String[] args) {

	}
}
