package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {
	public static void main(String[] args) {
		int []tables = {1, 2, 3,4};
		int []tables1 = {4, 5, 6, 7,8,10};
		int []tablesConcat = new int[tables.length + tables1.length];
		int count = 0;
		
		
		
		for (int i = 0; i < tables.length; i++)
		{
			tablesConcat[i] = tables[i];
			count++;
		}
		for (int value : tables1) tablesConcat[count++] = value;
		
			
			System.out.print(Arrays.toString(tablesConcat));
		
	}
	
	
	}

