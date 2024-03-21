import java.util.Arrays;

import com.google.gson.Gson;

/*
	{
		"winningNum" : [ 1, 2, 3, 4, 5, 6 ],
		"bonusNum" : 7
	}
	---------------------------
	{
		"games" : {
			"game1" : [ 11, 22, 33, 34, 44, 45 ],
			"game2" : [ 4, 5, 6, 10, 11, 12 ]
		}
	}
	----------------------------
	{
		"practice" : [ 4, 5, 6 ]
	}
*/
class MyClass {
	private int[] practice;

	public MyClass(int[] practice) {
		super();
		this.practice = practice;
	}

	@Override
	public String toString() {
		return "MyClass [practice=" + Arrays.toString(practice) + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		String text = "{\"practice\" : [ 4, 5, 6 ]}";
		
		MyClass m = gson.fromJson(text, MyClass.class);
		System.out.println(m);
	}
}




