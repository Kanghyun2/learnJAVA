import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// 다음과 같은 달력 모양을 콘솔에 출력하는 프로그램

// 2023-12-12 화
// 일   월   화   수   목   금   토
//                01 02 
// 03 04 05 06 07 08 09 
// 10 11 12 13 14 15 16 
// 17 18 19 20 21 22 23 
// 24 25 26 27 28 29 30 
// 31

// 1. 오늘의 날짜 정보 확인
// 2. 해당 월의 첫번째 날의 요일 확인
// ㄴ> 공백을 만듬
// 3. 해당 월의 길이 확인
// ㄴ> 마지막 출력

// 사용자 입력 (년, 월)
public class PrintCalendar2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("출력하고자 하는 달력의 년도 입력");
		int year = scan.nextInt();
		System.out.println("월 입력");
		int month = scan.nextInt();
		
		LocalDate firstDay = LocalDate.of(year, month, 1);
		String format = firstDay.format(DateTimeFormatter.ofPattern("yyyy년 MM월 달력"));
		System.out.println(format);
		
		int dayOfWeek = firstDay.getDayOfWeek().getValue();
		int length = firstDay.lengthOfMonth();
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");		
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <= length; i++) {
			System.out.printf("%02d\t", i);
			dayOfWeek++;
			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}
		}
	}
}








