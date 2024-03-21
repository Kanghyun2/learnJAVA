

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Monster m = new Monster(1000, 50);
		Hero2 h = new Hero2(200, 500, 50);
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.println("1.공격");
			System.out.println("2.회복");
			int input = scan.nextInt();

			if (input == 1) {
				System.out.println("공격" + h.getHeroHp() + "만큼 공격한다.");
				m.setMonsterHp(m.getMonsterHp() - h.getPower());
				System.out.println("몬스터 체력이" + m.getMonsterHp() + "만큼 남았습니다.");
			} else if (input == 2) {
				h.setHeroHp(h.getHeroHp() + h.getHeal());
				
				System.out.println("회복" + h.getHeal() + "만큼 했음");
				System.out.println("체력 :" + h.getHeroHp());
			}
			if (m.getMonsterHp() <= 0) {
				count++;
				m.setMonsterHp(m.getMonsterHp2());
			}
			if (h.getHeroHp() >= 0) {
				h.setHeroHp(h.getHeroHp() - m.getMonsterAt());
				System.out.println("몬스터가" + m.getMonsterAt() + "만큼 공격합니다.");
				System.out.println("영웅의 체력이" + h.getHeroHp() + "만큼 남았습니다.");
			}
			if (h.getHeroHp() <= 0) {
				System.out.println("영웅이 죽었습니다 게임종료.");
				System.out.println("몬스터 처치 횟수 :" + count);
				break;
			}
		}
	}
}