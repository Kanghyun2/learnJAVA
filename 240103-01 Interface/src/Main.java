// 커피
class Coffee {
}

// 아메리카노
class Americano extends Coffee {
}

// 카푸치노
class Cappuccino extends Coffee {
}

// 아메리카노를 만들 수 있음
interface AmericanoMakable {
	Americano makeAmericano();
} 
//인터페이스는 인터페이스를 상속할수 있음 인터페이스가 인터페이스를 상속할때  // 상속 (extends)
interface CappuccinoMakable extends AmericanoMakable {
	Cappuccino makeCappuccino();
}

class AdvancedCoffeMachine implements CappuccinoMakable {

	@Override
	public Americano makeAmericano() {
		return null;
	}

	@Override
	public Cappuccino makeCappuccino() {
		return null;
	}

}

class ExperiencedCafeStaff implements CappuccinoMakable {

	@Override
	public Americano makeAmericano() {
		return new Americano();
	}

	@Override
	public Cappuccino makeCappuccino() {
		return new Cappuccino();
	}
}

// 카페 알바생 (아메리카노를 만들 수 있음)
class CafePartTimer implements AmericanoMakable {

	@Override
	public Americano makeAmericano() {
		return new Americano();
	}
}

// 아메리카노 머신 (아메리카노를 만들 수 있음)
class AmericanoMachine implements AmericanoMakable {

	@Override
	public Americano makeAmericano() {
		return new Americano();
	}
}

public class Main {
	public static void main(String[] args) {
		CappuccinoMakable maker = new ExperiencedCafeStaff();
		maker.makeAmericano();
		maker.makeCappuccino();
		
//		AmericanoMakable maker = new CafePartTimer();
//		AmericanoMakable maker2 = new AmericanoMachine();
//
//		Coffee coffee = maker.makeAmericano();
//		System.out.println(coffee != null);
	}
}
