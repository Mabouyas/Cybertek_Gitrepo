package Practices;
import java.util.Scanner;
/*
Ask user to enter two words. Print first word without its first character then print the second word without its first character.
         Input:
            apple
            banana
         Output:
            ppleanana
 */
public class Practice2 {
    public static void main(String[] args) {
        //Declarations!!!
        String strFirst,strSecond;
        String str1,str2,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string:");
        strFirst = input.nextLine();
        str1 = strFirst.substring(1);
        System.out.println("Enter the second string:");
        strSecond = input.nextLine();
        str2 = strSecond.substring(1);
        result = str1.concat(str2);
        System.out.println(result);
    }
}







