package day23_methods;
/*
Write a program that can print out the unique values from a String Array
 */
public class UniqueValues {
	public static void main(String[] args) {
		String[] arr = {"A","B","A","D","C","B"};
		
		
		for (String eachElement : arr)
		{
			int count = 0;
			for (String eachIndex : arr)
			{
				if (eachIndex.equals(eachElement))
					count++;
			}
			if (count == 1)
				System.out.println(eachElement);
			
		}
		
	}
}
