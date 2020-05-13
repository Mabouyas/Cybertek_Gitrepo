package day18_NestedLoop;
/*
 write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
 */
public class Division
{
	public static void main(String[] args)
	{
		int dividend = 17;
		int divisor = 3;
		int quotient = 0;
		
		while (dividend >= divisor)
		{
			dividend -= divisor;
			quotient++;
		}
		System.out.println("Quotient is " + quotient );
		System.out.println("Dividend is " + dividend);
		
	}
}
