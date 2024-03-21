import java.util.regex.Pattern;

public class Main5 {
	public static void main(String[] args) {
		String input1 = "str1";
		String input2 = "str2";
		String input3 = "str3";
		
		// 범위가 아닌 나열도 가능
		Pattern p = Pattern.compile("str[13579]");
		System.out.println(p.matcher(input1).matches());
		System.out.println(p.matcher(input2).matches());
		System.out.println(p.matcher(input3).matches());
	}
}
