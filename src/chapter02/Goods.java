package chapter02;

// Jsp 안에서 쓰는 객체들을 Bean이라고 함.

public class Goods {
	// field definition
	private String name; // instance value
	private int price; // instance value
	private int countStock; // instance value
	private int countSold; // instance value
	
	public static int countOfGoods; //static value

	public void a1() { // 사실은 편의를 봐주는 것
		countOfGoods = 100;
	}
	
	// statc은 static만 접근한다. 
		public static void a() { // 사실은 편의를 봐주는 것
		//name = null;
	}
	
	
	
	public Goods() {
		//Goods.countOfGoods++;
		//Goods.countOfGoods += 1; // 원칙적으로는 클래스 이름(인스턴스 변수)로 접근해야 맞는 거임
		countOfGoods += 1; // 하지만 내부에서는 클래스 이름이 생략가능
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) {
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println(
				name + " : " + 
				price + " : " +
				countStock + " : " + 
				countSold);
	}
	
	public int calcDiscountPrice(float discountRate) {
		return price - (int)(price * discountRate);
	}
}
