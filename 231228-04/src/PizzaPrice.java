
public class PizzaPrice {
	public static void main(String[] args) {
			Pizza[] pepper = new Pizza[] {
			new PepperoniPizza(100000, 20)
			, new PepperoniPizza(150000, 25)
			, new PepperoniPizza(200000, 30)
			, new BulgogiPizza(100000, 200)
			, new BulgogiPizza(150000, 250)
			, new BulgogiPizza(200000, 300)
	};

		int count = 0;
		for (int i = 0; i < pepper.length; i++) {
			if(pepper[i] instanceof PepperoniPizza) {
			PepperoniPizza down = (PepperoniPizza) pepper[i];
			count += down.getCountPepperoni();
		}
		}
		System.out.println(count);
		
		int gr = 0;
		for (int i = 0; i < pepper.length; i++) {
			if(pepper[i] instanceof BulgogiPizza) {
				BulgogiPizza bul = (BulgogiPizza) pepper[i];
				gr += bul.getMeatWeight();
			}
		}
		System.out.println(gr);
			//		int sum = 0;
//		for (int i = 0; i < pepper.length; i++) {
//			sum += pepper[i].getPrice();
//		}
//		System.out.println(sum);
//	BulgogiPizza[] bulgogi = new BulgogiPizza[] {
//			new BulgogiPizza(10000, 200)
//			, new BulgogiPizza(15000, 250)
//			, new BulgogiPizza(20000, 300)
//		};
//	int sum2 = 0;
//	for (int i = 0; i < bulgogi.length; i++) {
//		sum2 += bulgogi[i].getPrice();
//		}
	}
}
