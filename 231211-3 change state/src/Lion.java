// 사자 클래스
// 사료를먹음(사료창고) : void
public class Lion {
	public void eatMeat(Warehouse warehouse) {
		warehouse.decreasedMeat(10);
	}
}
