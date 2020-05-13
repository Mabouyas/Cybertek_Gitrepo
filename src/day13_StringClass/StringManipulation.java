package day13_StringClass;

import java.util.Scanner;

/*
Write a program that asks the user first name and last name then print the initials
 */
public class StringManipulation {
    public static void main(String[] args) {
        // Declarations!!!


       Scanner names = new Scanner(System.in);
       System.out.println("Enter your first name :");
       String myFirstName = names.nextLine();
       String myLastName = names.nextLine();

          String myFirstNameInit = myFirstName.substring(0,1).toUpperCase();
          String myLastNameInit = myLastName.substring(0,1).toUpperCase();



        System.out.println("Your initial is :" + myFirstNameInit + myLastNameInit);

    }
}
