package OfficeHours.Practice_04_08;

import java.util.Scanner;

/*
 write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
 */
public class RoomReservation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		 int totalPrice = 0;
		 String result = "";
		 
		 while (true)
		 {
			 System.out.println("Which bedroom do you wanna reserve?");
			 String userEntry = scanner.nextLine();
			 
			 while (!(userEntry.equalsIgnoreCase("King Bed")
			 	|| userEntry.equalsIgnoreCase("Queen Bed")
				|| userEntry.equalsIgnoreCase("Single Bed")))
			 {
				 System.out.println("Invalid entry provided !, please re-enter.");
				 userEntry = scanner.nextLine();
			 }
			 
			 if (userEntry.equalsIgnoreCase("King Bed"))
			 	totalPrice += 120;
			 else if (userEntry.equalsIgnoreCase("Queen Bed"))
			 	totalPrice += 100;
			 
			 	
				
		 }
		 
	}
	
}
