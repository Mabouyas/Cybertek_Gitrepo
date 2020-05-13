package day17_WhileLoops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
 write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	 write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
 */
public class MaxAndMin {
	public static void main(String[] args) {
		//Declaration!!!
		Scanner input = new Scanner(System.in);
		int maxNumber = -2147483647;
		int minNumber = 2147483647;
		
		//Instructions!!!
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("Enter a number");
			int num = input.nextInt();
			if (num > maxNumber)
			{
				maxNumber = num;
			}
			
			if (num < minNumber)
			{
				minNumber = num;
			}
		}
		System.out.println("\nThe maximum number is :" + maxNumber);
		System.out.println("The minimum number is :" + minNumber);
	}
	
}



