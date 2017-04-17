package chapter02;

public  class ArrayUtils {
	public static double[] intToDouble(int[] Array)
	{
		double[]d2 = null;
		
		if(Array == null)
		{
			return d2;
		}
		
		int length = Array.length;
		d2 = new double[length];
		for(int i = 0; i < length; i++)
		{
			d2[i] = Array[i];
			
		}
		return d2;
	}
	
	public static int[] doubleToInt(double[] Array)
	{
		
//		int length = Array.length;   --> 초기 코드.
//		int[] i2 = {0,0,0,0,0};
//		
//		for(int i = 0; i < length; i++)
//		{
//			i2[i] = (int)Array[i];
//			
//		}
//		return i2;
		
		
		int []result = null;
		
		if(Array == null)
		{
			return result;
		}
		int length = Array.length;
		result = new int[length];
		
		for(int i = 0; i < length; i++)
		{
			result[i] = (int)Array[i];
			
		}
		return result;
		
	}
	
	public static int[] concat(int[] src1, int[] src2)
	{
		int[] result = null;
		if(src1 == null || src2 == null)
		{
			return result;
		}
		
		int length1 = src1.length;
		int length2 = src2.length;
		
		if(length1 == length2)
		{
			result = new int[length1];
		}
		
		
		for(int i =0; i < src1.length; i++)
		{
			result[i] = src1[i] + src2[i]; 
		}
		
		
		return result;
	}
	
}
