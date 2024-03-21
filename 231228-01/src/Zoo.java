public class Zoo {
	private Animal[] animal;

	public static void main(String[] args) {
		Duck duck = new Duck(1, 4);
		duck.Fly();
		duck.canWeeping();
		Eagle eagle = new Eagle(3, 5);
		eagle.Fly();
		eagle.canHunt();
		
		Lion lion = new Lion(150, 7);
		Elephant elephant = new Elephant(1500, 11);
		
		Zoo zoo = new Zoo();
		zoo.animal = new Animal[4];
		zoo.animal[0] = duck;
		zoo.animal[1] = eagle;
		zoo.animal[2] = lion;
		zoo.animal[3] = elephant;
		
		// 위 배열에서
		// 사자는 몇 번째 인덱스에 위치하나요?
		for(int i = 0; i < zoo.animal.length; i++) {
			if (zoo.animal[i] instanceof Lion) {
				System.out.println("사자 인덱스: " + i);
			}
		}
		
		// Bird는 몇 마리 인가요?
		int count = 0;
		for(int i = 0; i < zoo.animal.length; i++) {
			if (zoo.animal[i] instanceof Bird) {
				count++;
			}
		}
		System.out.println("새는 총" + count + "마리");
		
		// 위 배열에서 코끼리를 찾아 몸무게를 출력해보세요.
		for(int i = 0; i < zoo.animal.length; i++) {
			if (zoo.animal[i] instanceof Elephant) {
				System.out.println(zoo.animal[i].getWeight());
			}
		}
		
		// 위 배열에서 오리를 탐색하여 꽥꽥 소리
		for(int i = 0; i < zoo.animal.length; i++) {
			if (zoo.animal[i] instanceof Duck) {
				Duck down = (Duck) zoo.animal[i];
			down.canWeeping();
			}
		}
	}
}
