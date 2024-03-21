
public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(20); //(20) 확보할 문자 개수
		sb.append("원본");
		sb.append("추가");
		sb.append("구성");
		
		String result = sb.toString();
		System.out.println(result);
		
	}
}
