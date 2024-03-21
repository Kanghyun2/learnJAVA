import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0; // 기본값으로 미리 초기화를 해놔야 컴파일 에러를 막을 수 있음 .
		try {
			a = scan.nextInt();
			b = scan.nextInt();

			System.out.println(a / b);

		} catch (ArithmeticException e) {
			System.out.println("예외 발생 확인");
			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println(a);
//			System.out.println(b);
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해야합니다.");
		} catch (RuntimeException e) { // 부모 는 밑으로 와야 컴파일 에러가안남 위에서 혼자 다잡아버리기 때문에
			System.out.println("Arimetic 예외와 InputMistmatch 예외를 제외한 모든 Runtime 예외 처리");
		}

//		System.out.println(a);
//		System.out.println(b);
	}
}
