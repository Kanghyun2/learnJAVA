import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

// 다음과 같은 달력 모양을 콘솔에 출력하는 프로그램

// 사용자 입력 (년, 월)

// 1. 오늘의 날짜 정보 확인
// 2. 해당 월의 첫번째 날의 요일 확인
// ㄴ> 공백을 만들기 위해서
// 3. 해당 월의 길이(length) 확인
// ㄴ> 마지막 날짜 출력
public class PrintCalendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년 입력");
		int year = scan.nextInt();
		System.out.println("월 입력");
		int month = scan.nextInt();

		LocalDate firstDay = LocalDate.of(year, month, 1);
		String format = firstDay.format(DateTimeFormatter.ofPattern("yyyy년 MM월 달력"));
		System.out.println(format);

		int dayOfWeek = firstDay.getDayOfWeek().getValue();
		int length = firstDay.lengthOfMonth();

		System.out.println("일   월   화   수   목   금   토"); // \t 일정한 공백 만들어줌 tab 키
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("   ");
		}

		for (int i = 1; i <= length; i++) {
			System.out.printf("%02d ", i);
			dayOfWeek++;
			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}
		}

	}
}
