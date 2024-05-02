package thread;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("시작");

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for (int i = 0; i < 10; i++) {
					sum += i;
				}
				System.out.println(Thread.currentThread().getName() + "작업 결과: " + sum);
			}
		});
		t.start();
		
		int sum2 = 0;
		for (int i = 10; i < 20; i++) {
			sum2 += i;
		}
		System.out.println(Thread.currentThread().getName() + "작업 결과" + sum2);
		
		Thread.sleep(1000);
		
		System.out.println("모든 작업 종료");
	}
}
