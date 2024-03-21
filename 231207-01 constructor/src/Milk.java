// 우유
// 상품명
// 제조일 한번 값이 결정되면 변경 X
public class Milk {
	String name;
	final String productionDate;
	public Milk (String name, String productionDate) {
		this.name = name;
		this.productionDate = productionDate;
	}
	
	public static void main(String[] args) {
		Milk m = new Milk("부산우유", "2023.12.07");
		System.out.println(m.productionDate);
	//	m.productionDate = "2024.01.01";
	//	System.out.println(m.productionDate);
		Milk s = new Milk("서울우유", "2022.05.05");
		System.out.println(s.productionDate);
	}

}
