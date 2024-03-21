import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7 {
	public static void main(String[] args) {
		// 최소값 {1,} , 최대값 {0,10}
		Pattern p = Pattern.compile("[a-z]{12,}");
		Matcher m = p.matcher("abcdefghijk");
		
		System.out.println(m.matches());
	}
}
