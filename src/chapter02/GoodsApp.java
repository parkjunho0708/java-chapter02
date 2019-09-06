package chapter02;

// class function and namespace function are almost same.
public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods(); // camera : instance value
		camera.setName("nikon");
		//camera.price = -1;
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		long l = 123456789012L;
		
		System.out.println(Goods.countOfGoods);
		
		camera.showInfo();
		// 값을 문자 그대로 적어주는 것을 literal
		System.out.println(camera.calcDiscountPrice(0.5f));
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		System.out.println(Goods.countOfGoods);
		
		//camera.name = "nikon";
		//camera.price = 400000;
		//camera.countStock = 30;
		//camera.countSold = 50;
		
//		System.out.println(	camera.name + " : "
//		+ camera.price + " : " + camera.countStock + " : " + camera.countSold);
		//Goods camera2 = new Goods();
		
		
	}
}
