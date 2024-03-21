public class MonsterTest {
public static void main(String[] args) {
	Monster m = new Monster(1000, 50);
	System.out.println(m.getMonsterHp());
	System.out.println(m.getMonsterAt());
	System.out.println(m.getMonsterHp2());
	Hero2 h = new Hero2(200, 500, 50);
	System.out.println(h.getHeroHp());
	System.out.println(h.getPower());
	
	System.out.println(h.getHeroHp());
	
	}
}

