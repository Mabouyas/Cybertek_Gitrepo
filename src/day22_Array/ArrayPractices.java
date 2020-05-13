package day22_Array;


import java.util.Arrays;

public class ArrayPractices {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		int[] scores = { 45,67,93 };
		numbers[0] = 20;
		numbers[1] = 30;
		numbers[2] = 45;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
	}
}
