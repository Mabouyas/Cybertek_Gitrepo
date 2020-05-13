
package day14_StringClass;

import java.util.Scanner;

/*
 Ask user to enter two words. Print the first word, second word, second word, first word
    Input:
        one
        two
    Output:
        one two two one
            DO NOT USE + OPERATOR
 */
public class Practice1 {
    public static void main(String[] args) {
        //Declarations!!!

        String firstStr;
        String secondStr;
        String str_Concat;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word:");
        firstStr = input.nextLine();

        System.out.println("Enter the second word");
        secondStr = input.nextLine();

        str_Concat = (firstStr.concat(secondStr).concat(secondStr).concat(firstStr));

        System.out.println(str_Concat);
    }
}
