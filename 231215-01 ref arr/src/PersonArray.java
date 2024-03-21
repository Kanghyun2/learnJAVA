import java.util.Scanner;

// 사용자 3명의 인적정보를 (이름:String, 나이:int)
// 입력받아 출력하는 프로그램
public class PersonArray {
	public static void main(String[] args) {
//		String[] names = new String[3];
//		int[] ages = new int[3];

		UserInfo[] users = new UserInfo[3];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < users.length; i++) {
			System.out.println("사용자의 이름은?");
			String name = scan.nextLine();
			System.out.println("사용자의 나이는?");
			int age = scan.nextInt();
			scan.nextLine(); // 입력 버퍼를 비움.

			users[i] = new UserInfo(name, age);
		}
		
		for (int i = 0; i < users.length; i++) {
//			UserInfo user = users[i]; 호출 해서 도 가능
			System.out.println(users[i].getName());
			System.out.println(users[i].getAge());
			users[i].printAll();
		}
	}
}
