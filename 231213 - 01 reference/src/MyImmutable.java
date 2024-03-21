
public class MyImmutable {
	private int value;
	
	public MyImmutable(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		MyImmutable my = new MyImmutable(100);
		
//		my.set??;
		
		System.out.println(my.getValue());
	}
}
