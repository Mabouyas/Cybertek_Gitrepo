package day13_StringClass;
/*
write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        //Declarations!!!
        String fullAddress = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your complete name.");
        String name = input.nextLine();

        System.out.println("Enter Street number:");
        int stNumber = input.nextInt();
        fullAddress += stNumber;

        System.out.println("Enter Street name:");
        String stName = input.nextLine();
        fullAddress += stName;
    }

}
