import java.time.LocalDate;

public class TestImmutable {
public static void main(String[] args) {
	LocalDate today = LocalDate.now(); // 불변
	LocalDate bookDay = today;
	
	bookDay = bookDay.plusDays(15);
	
	System.out.println(bookDay);
	System.out.println(today);
}
}
