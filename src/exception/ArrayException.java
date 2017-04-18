package exception;

public class ArrayException {
   //unchecked exception의 예  - 굳이 try-catch문을 사용할 필요가 없는 코드.
	public static void main(String[] args) {
		try{
			int[] intArray = new int[5];
			intArray[0] = 0;

			for(int i = 0; i < 5; i++)	{
				intArray[i+1] = i +1 + intArray[i];
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);

			}
		}
		catch(Exception ex)	{
			ex.printStackTrace();

		}
	}

}
