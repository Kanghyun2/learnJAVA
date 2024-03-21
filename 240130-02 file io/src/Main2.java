import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.google.gson.Gson;

class Number {
	private int[] winningNum;
	private int bonusNum;

	public int[] getWinningNum() {
		return winningNum;
	}

	public Number(int[] winningNum, int bonusNum) {
		super();
		this.winningNum = winningNum;
		this.bonusNum = bonusNum;
	}

	@Override
	public String toString() {
		return "Number [winningNum=" + Arrays.toString(winningNum) + ", bonusNum=" + bonusNum + "]";
	}
}

class games {
	private int[] game1;
	private int[] game2;

	public int[] getGame1() {
		return game1;
	}

	public int[] getGame2() {
		return game2;
	}

	public games(int[] game1, int[] game2) {
		super();
		this.game1 = game1;
		this.game2 = game2;
	}

	@Override
	public String toString() {
		return "games [game1=" + Arrays.toString(game1) + ", game2=" + Arrays.toString(game2) + "]";
	}
}

public class Main2 {
	public static void main(String[] args) {
		Gson gson = new Gson();
		String Num = "{\"winningNum\" : [ 1, 2, 3, 4, 5, 6 ], \"bonusNum\" : 7}";
		String Game = "{\"game1\" : [ 11, 22, 33, 34, 44, 45 ],\"game2\" : [ 4, 5, 6, 10, 11, 12 ]}";

		// Json 문자열을 객체로 변환
		Number n = gson.fromJson(Num, Number.class);
		games g = gson.fromJson(Game, games.class);
		
		System.out.println(n);
		System.out.println(g);
		
		// sameCount(arr, arr2) 배열에 넣어서 카운트 올려 반환.
		int count1 = sameCount(n.getWinningNum(), g.getGame1());
		int count2 = sameCount(n.getWinningNum(), g.getGame2());
		
		System.out.println("game1 비교값 " + count1);
		System.out.println("game2 비교값 " + count2);
	}

	public static int sameCount(int[] arr, int[] arr1) {
		Set<Integer> ball = new HashSet<>();
		for (int num : arr) {
			ball.add(num);
		}
		int count = 0;
		for (int num : arr1) {
			if (ball.contains(num)) {
				count++;
			}
		}
		return count;
	}
//	public static int bonusCount(int b, int[] arr) {
//		Set<Integer> bonus = new HashSet<>();
//		if () {
//		}
//		
//	}
}
