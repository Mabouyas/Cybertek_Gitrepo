package day10_Switch_Scanner;


import java.util.*;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total;
        System.out.print("Enter the first number:");

        byte num1 = input.nextByte();
        System.out.print("Enter the second number");
        byte num2 = input.nextByte();
         total = num1 + num2;

        System.out.println(total);
    }
}
