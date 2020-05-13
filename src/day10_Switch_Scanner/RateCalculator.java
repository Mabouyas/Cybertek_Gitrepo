package day10_Switch_Scanner;
/*
 write a program for the rate calculator: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
 */
import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Hour worked");
        double hourWorked = s.nextInt();
        double wage = 30.4;
        int maxHours = 40;
        double totalWages;

        totalWages = wage * maxHours;




    }
}
