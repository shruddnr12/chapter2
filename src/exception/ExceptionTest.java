package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		try{
		 int b =100/a;
		}
		catch(ArithmeticException ex){
			//ex.printStackTrace();
			//1.사과
			System.out.println("죄송합니다.");
			//2.로그 남기기
			System.out.println("로그: exception:" + ex);
			
			//3.종료
			return ;
		}
		finally{
			//자원정리
			System.out.println("자원정리");
		}
		System.out.println("Some more Codes");

	}

}



//package exception;
//
//public class ExceptionTest {
//
//	public static void main(String[] args) {
//		int a = 0;
//		try{
//		int b =100/a;
//		}
//		catch(ArithmeticException ex){
//			//ex.printStackTrace();
//			System.out.println("예외 발생");
//		}
//		finally
//		{
//			
//		}
//		System.out.println("Some more Codes");
//
//	}
//
//}
