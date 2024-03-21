

public class Monster {
	private int monsterHp;
	private int monsterAt;
	final int monsterHp2;
	
	public Monster(int monsterHp, int monsterAt) {
		this.monsterHp = monsterHp;
		this.monsterAt = monsterAt;
		this.monsterHp2 = monsterHp;
	}
	
	public int getMonsterHp() {
		return monsterHp;
	}
	
	public void setMonsterHp(int monsterHp) {
		this.monsterHp = monsterHp;
	}
	
	public int getMonsterAt() {
		return monsterAt;
	}
	
	public void setMonsterAt(int monsterAt) {
		this.monsterAt = monsterAt;
	}
	
	public int getMonsterHp2() {
		return monsterHp2;
	}
	
	
	 
}
