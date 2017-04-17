package chapter02;

import mypackage.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();  //기본 생성자는  파라미터가 없이 기본적으로 자동적으로 만들어 진다. 
		//public은 제한이 없다.
		camera.name = "nikon";  // camera.name = new String("nikon")으로 내부적으로 자동으로 바뀐다.
		
		//protected는 같은 패키지 또는 자식 클래스에서만
		//camera.price = 400000;
		
		//default는 같은 패키지에서만 접근 가능 
		//camera.countStock = 30;
		
		//private은 내부에서만 사용가능
		//camera.countSold = 50;
		//camera.setCountSold(50);
		
		System.out.println(camera);
		System.out.println("이름:" + camera.name 
				//+ ", 가격: "+ camera.price 
				//+ ", 재고개수: " + camera.countStock 
				//+ ", 팔린 개수:" + camera.countSold 
				);
		
		camera.setCountSold(10);
		camera.showInfo();
		System.out.println(camera.getCountSold());
		
		camera.setPrice(-10000);
	}

}
