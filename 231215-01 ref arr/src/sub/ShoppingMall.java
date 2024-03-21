package sub;

// 물건을 담은 쇼핑몰 클래스
// 물건들을 배열로 저장해서 정보를 출력해줌
public class ShoppingMall {
	private Product[] productArr;

	public ShoppingMall() { // 배열의 길이가 5인 물건 배열을 생성후 .. 빈값으로 초기화...
		this.productArr = new Product[5];
		for (int i = 0; i < productArr.length; i++) {
			productArr[i] = null;
		}
	}
	public Product[] getProductArr() {
		return productArr;
	}

	// 물건을 입력받아서 물건을 빈칸에 앞에서부터 채움
	public void setproductAuto(Product product) { // 맨 앞칸부터 물건을 진열함. 진열할 수 없다면 진열하지않음.
		for (int i = 0; i < productArr.length; i++) {
			if (productArr[i] == null) {
				productArr[i] = product;
				break;
			}
			if (i == productArr.length - 1 && productArr[productArr.length - 1] != null) {
				System.out.println("더 이상 물건을 진열할 수 없습니다.");
			}
		}
	}

	public void soldoutProduct() { // 다팔린 물건이 있을경우, 빈칸이 없게끔 물건을 정렬함.
		for (int i = 0; i < productArr.length - 1; i++) {
			if (productArr[i] == null) {
				if (productArr[i + 1] != null) {
					productArr[i] = productArr[i + 1];
					productArr[i + 1] = null;
				}
			}
		}
	}

	public void info() { // 모든 물건의 이름 금액 개수 출력 ..
		for (int i = 0; i < productArr.length; i++) {
			if (productArr[i] != null) {
				System.out.printf("%d. %s : %d원, %d개 남음\n", i + 1, productArr[i].getName(), productArr[i].getPrice(),
						productArr[i].getStock());
			}
		}
	}

	public void buyProduct(int input, User user) {// if 돈이 금액이상이면 구매, 구매시 재고 감소 및 재고가 0이면 null로 바꾸기, totalSpent에 구매금액만큼
													// 더하기.
		// 돈이 금액 이하면 못산다고 알려주기
		if (input >= 1 && input <= 5) {
			if (productArr[input - 1] != null) {
				if (productArr[input - 1].getPrice() > user.getMoney()) {
					System.out.println("금액이 모자랍니다.");
				} else {
					System.out.println("구매 성공 하셨습니다.");
					productArr[input - 1].setStock(productArr[input - 1].getStock() - 1);
					user.setMoney(user.getMoney() - productArr[input - 1].getPrice());
					user.setTotalSpent(user.getTotalSpent() + productArr[input - 1].getPrice());
					user.membership(); // 재고 - , 현재 금액 - 상품금액
					if (productArr[input - 1].getStock() == 0) {// 재고 0일때 null 값 .... 아이거 같이만든거구나
						productArr[input - 1] = null;
					}
				}
			} else {
				System.out.println("해당하는 번호의 물건을 찾을 수 없습니다.");
			}
		}
	}
}
