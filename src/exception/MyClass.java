package exception;

import java.io.IOException;

public class MyClass {
	public void dangerousMethod() throws MyException{
		System.out.println("예외 발생 전");
		
		if(1 == 1){
			throw new MyException("예외 클래스 테스트");
		}
		System.out.println("예외 발생 후");
	}
}
