package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("/hello.txt");	
			fis.read();
			
		}
	  catch(FileNotFoundException ex)
		{
		  System.out.println("파일을 찾을 수 없습니다.");
		}
		catch(IOException ex){
			  System.out.println("파일 읽기 실패.");					
		}
		
	}

}
