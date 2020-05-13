package day20_ArraysContinue;

public class Max_Min {
	public static void main(String[] args) {
		int[] tables = {2,3,4,5,6,7,8,9};
		int tablesLenght = tables.length-1;
		int max = tables[0];
		int min = tables[0];
		for (int i = 0; i <= tablesLenght;i++)
		{
			max += tables[1];
			System.out.println(max);
			
		}
		
	}
}
