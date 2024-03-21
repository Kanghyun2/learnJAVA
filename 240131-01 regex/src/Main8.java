import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main8 {
	public static void main(String[] args) {
		// \w : [A-Za-z0-9_]
		// \d : [0-9] 숫자
		// ? : {0,1} 길이값
		// + : {1,} 최소값만 결정됨
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("1234");
		
		System.out.println(m.matches());
		
	}
}
