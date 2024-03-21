import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;import java.util.Arrays;
import java.util.Scanner;

// 콘솔창에서
// 사람의 이름, 나이를 입력받아

// 절대경로 d:\\mydata\\person.txt 파일에 출력하기

// 출력 형식은 '문자' 정보이며
// 첫번째 줄에는 이름
// 두번째 줄에는 나이
// 를 기록한다.

// 만약 (길동, 22) (둘리, 33) (도우너, 44)
// ???

public class Main8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int num = 0;
		
		File folder = new File("d:\\mydata\\person\\");
		if (!folder.exists()) {
			folder.mkdir();
		}
		String[] filenames = folder.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String n) {
				if (n.startsWith("person") && n.endsWith(".txt")) {
					return true;
				}
				return false;
			}
		});
		PrintWriter ps = null;
		try {
			boolean go = true;
			while (go) {
				System.out.println("이름?");
				String name = scan.nextLine();
				if (name.equals("")) {
				go = false;
				System.out.println("입력 종료");
				} else {
					ps = new PrintWriter(new FileWriter(new File(folder, name + (filenames.length + 1) + ".txt")));
					System.out.println("나이?");
					String age = scan.nextLine();
					ps.write("개발자 : " + name + "\n");
					ps.write("나이 : " + age + "\n");
					ps.flush();
//					num ++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
	}
}
