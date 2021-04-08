package demo;

public class FindResult {
	public static int FindMaxNum(int[] arr)
	{
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		return max;
		
	}
	public static boolean isEvenNum(int n)
	{
		boolean isFlag = false;
		if(n%2==0)
		{
			isFlag=false;
		}
		else
		{
			isFlag=true;
		}
		return isFlag;
		
	}
	
	
}
