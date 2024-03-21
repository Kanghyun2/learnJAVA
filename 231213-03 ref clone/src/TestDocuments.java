// 문서서랍장
// 문서 서랍장엔 3개의 문서만 보관할 수 있음.

// 문서
// 작성자
// 작성일
// 내용요약
// 중요도 중요도가 높은게 앞쪽 낮은게 뒤쪽

public class TestDocuments {
	public static void main(String[] args) {
		Doucument d1 = new Doucument ("작성자1", "12월1일", "수업", 10);
		Doucument d2 = new Doucument ("작성자2", "11월1일", "복습", 8);
		Doucument d3 = new Doucument ("작성자3", "10월1일", "숙제", 5);
		DoucumentDrawer drawer1 = new DoucumentDrawer();
		DoucumentDrawer drawer2 = new DoucumentDrawer();
		DoucumentDrawer drawer3 = new DoucumentDrawer();
		
		drawer1.setDoucument1(d3.getImportance());
		drawer2.setDoucument2(d1.getImportance());
		drawer3.setDoucument3(d2);
		System.out.println(d1);
//		if (d1.getImportance() > d2.getImportance()) {
//			DoucumentDrawer drawer11 = 
//					new DoucumentDrawer()
		}
		
		
	}

