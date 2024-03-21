import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main14 {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(100, "백");
		map.put(1, "일");
		map.put(1000, "천");
		map.put(250, "이백오십");
		
//		System.out.println(map.toString());
		
		TreeMap<Integer, String> down = (TreeMap<Integer, String>) map;
		Map<Integer, String> headMap = down.headMap(251);
		System.out.println(headMap);
		
		Map<Integer, String> tailMap = down.tailMap(249);
		System.out.println(tailMap);
	}
}
