

public class Hero2 {
	private int heroHp;
	private int power;
	private int heal;
	public Hero2(int heroHp, int power, int heal) {
		this.heroHp = heroHp;
		this.power = power;
		this.heal = heal;
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getHeroHp() {
		return heroHp;
	}
	
	public void setHeroHp(int heroHp) {
		this.heroHp = heroHp;
	}
	
	public int getHeal() {
		return heal;
	}
	
	public void setHeal(int heal) {
		this.heal = heal;
	}
}
