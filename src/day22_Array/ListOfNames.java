package day22_Array;




public class ListOfNames
{
	public static void main(String[] args)
	{
		int[] numbers = new int[50];
		int i;
		
		for (i = 0; i < numbers.length; i++)
		{
			numbers[i] =i + 1;
			System.out.print(numbers[i]);
		}
		
	}
}
