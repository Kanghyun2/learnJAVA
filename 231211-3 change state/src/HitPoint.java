// 몬스터
// HP(체력) : int
// 공격력 : int
// 공격한다(몬스터) {
// 몬스터의 HP(체력) 이 공격력 만큼 감소해야 합니다.
// }
public class HitPoint {
	private int hp;
	private int power;
	public HitPoint(int hp, int power) {
		this.hp = hp;
		this.power = power;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void decreasedHp(int power) {
		hp -= power;
	}

}
