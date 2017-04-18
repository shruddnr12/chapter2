package exception;

import java.io.IOException;

public class MyClassTest {
	// 회피하는 방식(얌체 같은 짓이다)
	public static void main(String[] args) {
		try {
			test();   
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test() throws MyException
	{
		MyClass m = new MyClass();
	    m.dangerousMethod();
		
	}

}




//package exception;
//
//import java.io.IOException;
//
//public class MyClassTest {
//
//	public static void main(String[] args) {
//		MyClass m = new MyClass();
//		try {
//			m.dangerousMethod();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//
//}
