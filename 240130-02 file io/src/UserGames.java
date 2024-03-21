import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

class Games {

	public List<Integer> game1;
	public List<Integer> game2;

}

public class UserGames {

	public Games games;
	
	public static void main(String[] args) {
		Games games = new Games();
		games.game1 = Arrays.asList(11, 22, 33, 34, 44, 45);
		games.game2 = Arrays.asList(4, 5, 6, 10, 11, 12);
		
		UserGames userGames = new UserGames();
		userGames.games = games;
		
		Gson gson = new Gson();
		String text = gson.toJson(userGames);//문자열
		
		System.out.println(text);
		
		UserGames copy = gson.fromJson(text, UserGames.class);//객체화
		System.out.println(copy.games.game1);
		System.out.println(copy.games.game2);
	}
}
