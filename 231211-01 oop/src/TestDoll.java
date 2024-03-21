public class TestDoll {
	public static void main(String[] args) {
		Doll d1 = new Doll("처키", 15000);

		Doll d2 = new Doll("허기워기", 20000);
		
		DollFactory fac = new DollFactory();
		Doll h = fac.createDoll(1);
		Doll c = fac.createDoll(2);
		Doll a = fac.createDoll(3);
		
		System.out.println(h.getModel());
		System.out.println(c.getModel());
		System.out.println(a.getModel());
		
		Doll n = fac.createDoll(-1);
		if (n != null) {
			System.out.println(n.getModel());
		}
		
//		Doll goods1 = fac.createDoll();
//		Doll goods2 = fac.createDoll();
//		Doll goods3 = fac.createDoll();
//		Doll goods4 = fac.createDoll();
		
//		System.out.println(goods1.getModel());
//		System.out.println(goods1.getPrice());
	}
}
