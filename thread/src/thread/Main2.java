package thread;

class MyTask extends Thread {
	private int start;
	private int end;
	
	public MyTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		// 해당 스레드가 수행해야하는 작업 
		int sum = 0;
		for ( int i = start; i < end; i++ ) {
			sum += i;
		}
		System.out.println("합 계산 완료, 결과: " + sum);
	}
}

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyTask(0, 100);
		Thread t2 = new MyTask(10, 20);
		Thread t3 = new MyTask(1000, 20000);
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(1000);
		
		System.out.println("모든 작업 종료");
	}
}
