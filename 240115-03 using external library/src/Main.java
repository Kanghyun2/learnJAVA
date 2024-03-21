import dongsu.DongsuUtil;
import kanghyun.HyunUtil;

public class Main {
	public static void main(String[] args) {
		DongsuUtil u = new DongsuUtil();
		int result = u.plus(100, 200);
		System.out.println(result);
		
		HyunUtil h = new HyunUtil();
		System.out.println(h.plus(300, 400));
		System.out.println(h.divide(300, 400));
	}
}
