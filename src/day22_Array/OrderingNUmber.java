package day22_Array;

public class OrderingNUmber
{
	public static <n> void main(String[] args)
	{
		int[] myArray = {240,40,321,56,8976,38,12,5,2};
		int temp = 0;
		
		for (int i = 0; i < myArray.length; i++)
		{
			for ( int j = 0; j < myArray.length-1;j++)
			{
				if (myArray[j] > myArray[j + 1])
				{
					temp = myArray[j + 1];
					myArray[j + 1] = myArray[j];
					myArray[j] = temp;
				}
			}
			
		}
		for (int each : myArray)
		System.out.print(each + " ");
		
		
	}
}
