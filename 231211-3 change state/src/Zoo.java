public class Zoo {
public static void main(String[] args) {
	// 사료창고를 생성하고
	Warehouse w1 = new Warehouse(100, 100);
	// 사자 생성
	Lion lion = new Lion();
	// 하마 생성
	Hippo hippo = new Hippo();
	
	// 사자.사료를먹음(사료창고) 호출
	lion.eatMeat(w1);
	// 하마.사료를먹음(사료창고) 호출
	hippo.eatHay(w1);
	
	System.out.println(w1.getMeat());
	System.out.println(w1.getHay());
	
	}
}
