package mypackage;

public class Goods {
	public final static  float DISCOUNT_RATE = 0.2f; //final은 변수를 상수로 만들때 사용가능하다. 변경이 불가하다.
	public static int countOfGoods;
	
	public String name;  //public(제한이 없음)
	protected int price; //protected (같은 패키지 + 자식)
	int countStock;      //default(같은 패키지)
	private int countSold; //private (한 클래스 내부에서만)
	
	public Goods()  
	{
		Goods.countOfGoods++; //Goods는 생략가능하다.
	}
	
	public void setPrice(int price)
	{
		if(price < 0)
		{
			price = 0;
		}
		this.price = price;
	}
	
	
	public void setCountSold(int countSold){
		//countSold = countSold;  // warning이 뜬다. 매개변수냐 필드 변수냐 헷갈린다. 우선순위는 매개변수가 우선이다. 그럼 의미가 없다.
		this.countSold =countSold;
	}
	
	public int getCountSold(){
		return countSold;
	}
	
	public void showInfo(){
		 System.out.println("이름:" + name 
				+ ", 가격: "+ price 
				+ ", 재고개수: " + countStock 
				+ ", 팔린 개수:" + countSold );
	}
	
	public int calcDiscountPrice(int percentage)
	{  
		int discountPrice = price * percentage/100;
		return discountPrice;
	}
	
}
