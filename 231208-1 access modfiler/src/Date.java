// 날짜
// 연
// 월
// 일
public class Date {
	private int year;
	private int month;
	private int day;

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

//	public boolean setMonth(int month) {
//		if (month >= 1 && month <= 12) {
//		this.month = month;
//		return true;
//		} else {
//			return false;
//		}
//	}
	
	public int setMonth(int month) {
		this.month = month;
		if (month < 1) {
			this.month = 1;
		} else if (month > 12) {
			this.month = 12;
		}
		return this.month;
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDay() {
		return day;
	}
}
