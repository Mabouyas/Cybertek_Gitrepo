package day14_StringClass;

import java.util.Scanner;

/*
Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
 */
public class practice3 {
    public static void main(String[] args) {
        //Declarations!!!
        String str1,strChar1;
        char strChar;
        int longStr,strMid;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:" );
        str1 = input.nextLine();
               longStr = str1.length();
               strMid  = longStr / 2;
        strChar = str1.charAt(strMid);
        strChar1 = str1.charAt(strMid -1) + "" + str1.charAt(strMid);

        if (longStr % 2 != 0)
            System.out.println("The middle character of " + str1 + " is " + strChar );
        else
            System.out.println("The middle character of " + str1 + " is " + strChar1 );
    }
}
