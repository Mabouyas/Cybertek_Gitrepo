package day08_IfStatements;

/**
 write a program that can find the number of days in a month
 (Assume that Feb has 28 days)
 byte month =  3
 28 days: 2
 30 days: 4,6,9,11
 31 days: 1,3,5,7,8,10,12



public class DaysInMonth {
    public static void main(String[] args) {



        byte months = 11;

        String result;

        if( months == 1 ) result = "January has 31 days";
        else if(months == 2) result = "Feburary has 28 or 29 days";
        else if(months ==3) result = "March has 31 days";
        else if(months == 4) result = "April has 30 days";
        else if(months == 5) result = "May has 31 days";
        else if(months == 6) result = "June has 30 days";
        else if(months ==7) result = "July has 31 days";
        else if(months ==8 ) result = "August has 31 days";
        else if(months == 9) result = "September has 30 days";
        else if(months == 10) result = "October has 31 days";
        else if(months == 11) result = "November has 30 days";
        else if(months ==12) result = "December has 31 days";
        else result = "Invalid Entry";

        System.out.println(result);





    }
}
 */

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String answer = s.nextLine();

        //your code here

        if (answer.equals("a")) System.out.println("a is wrong");
        else  if (answer.equals("b")) System.out.println("b is correct");
        else  if (answer.equals("c")) System.out.println("c is wrong");
        else System.out.println(answer+" is not a valid answer");





    }
}