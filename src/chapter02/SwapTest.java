package chapter02;

public class SwapTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a + "," + b);
		swap(a,b);
		
//		int temp = a;
//		a=b;
//		b=temp;
		
		System.out.println(a + "," + b);
		
		Value val1= new Value();
		val1.v =10;
		Value val2= new Value();
		val2.v =20;
		
		System.out.println(val1.v + "," + val2.v);
		swap(val1,val2);
		System.out.println(val1.v + "," + val2.v);
		
		
	}
	public static void swap(Value v1, Value v2)
	{
		int temp = v1.v;
		v1.v = v2.v;
		v2.v = temp;
	}
	
	public static void swap(int v1, int v2)
	{
		int temp = v1;
		v1=v2;
		v2=temp;
	}

}
