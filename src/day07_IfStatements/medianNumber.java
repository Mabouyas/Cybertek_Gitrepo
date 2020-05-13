package day07_IfStatements;
/*
write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
 */
public class medianNumber {
    public static void main(String[] args) {
       int num1 = 52;
       int num2 = 14;
       int num3 = 25;


        if (((num1 >= num2) && (num1 <= num3)) || ((num1 <= num2) && (num1 >= num3)))
            System.out.print("Medium value is: " + num1);
        else if (((num2 >= num1) && (num2 <= num3))||((num2 <= num1) && (num2 >= num3)))
            System.out.print("Medium value is: " + num2);
        else if (((num3 >= num1) && (num3 <= num2))||((num3 <= num1) && (num3 >= num2)))
            System.out.print("Medium value is: " + num3);






    }
}
