import java.util.Arrays;

public class TestIsA {
	public static void main(String[] args) {
//		int[] arr = { 3.14, 10 };
//		
//		double[] d = { 3.14, 10 };
		
		Number[] arr = {
				Integer.valueOf(10)
				, Double.valueOf(3.14)
		};
		
		System.out.println(Arrays.toString(arr));
	}
}
