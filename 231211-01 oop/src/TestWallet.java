
public class TestWallet {
	public static void main(String[] args) {
		Wallet w = new Wallet(5000);

		w.setMoney(15000);
		System.out.println(w.getMoney());
		
		Customer cus = new Customer(w);
		Wallet cusWallet = cus.getWallet();
		System.out.println(cusWallet.getMoney());
	
		cus.setMoney(-10000);
		System.out.println(cus.getMoney());
		
		System.out.println(w.getMoney()); // 인스턴스 . 같은 지갑
		
		Customer cus2 = new Customer(w);
		Customer cus3 = new Customer(new Wallet(30000));
		
		System.out.println(cus.getWallet() == cus2.getWallet());
		System.out.println(cus.getWallet() == cus3.getWallet());
		
	}
}