import org.javatuples.Decade;
import org.javatuples.Pair;

public class Main {
	public static void main(String[] args) {
		//튜플, 트리플...
		Pair<String, Integer> pair = Pair.with("hello", Integer.valueOf(23));
		
		System.out.println(pair.getValue0());
		System.out.println(pair.getValue1());
		Decade<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> decade = Decade.with(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(decade.getValue0());
		System.out.println(decade.getValue1());
		System.out.println(decade.getValue2());
		System.out.println(decade.getValue3());
		System.out.println(decade.getValue4());
		System.out.println(decade.getValue5());
		System.out.println(decade.getValue6());
		System.out.println(decade.getValue7());
		System.out.println(decade.getValue8());
		System.out.println(decade.getValue9());
	}
}
