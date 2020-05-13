package day14_StringClass;

import java.util.*;

class Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE
        // Declarations!!!
        int giftCard = 100;



        //Instructions!!!

        if(item.equals("Smartphone"))
            System.out.println("Sorry, not enough funds on your gift card!");

        else
        if(item.equals("Laptop"))

            System.out.println("Sorry, not enough funds on your gift card!");

        else
        if(item.equals("Charger"))
        {
            int currentBal = giftCard - 15;
            System.out.println("Thank you for your purchase!"
                    + "\n your current balance is: " + currentBal);
        }

        else
        if(item.equals("USB cable"))
        {
            int currentBal = giftCard - 10;
            System.out.println("Thank you for your purchase!"
                    + "\n your current balance is: " + currentBal);
        }

        else
        if(item.equals("Headphones"))
        {
            int currentBal = giftCard - 30;
            System.out.println("Thank you for your purchase!"
                    + "\n your current balance is " + currentBal);
        }

        else
        if(item.equals("Pants"))
        {
            int currentBal = giftCard - 50;
            System.out.println("Thank you for your purchase!"
                    + "\n your current balance is " + currentBal);
        }

        else
        if(item.equals("Hat"))
        {
            int currentBal = giftCard - 25;
            System.out.println("Thank you for your purchase!"
                    + "\n your current balance is " + currentBal);
        }

        else
        if(item.equals("Socks"))
        {
            int currentBal = giftCard - 5;
            System.out.println("Thank you for your purchase!"
                    + "\n your current balance is " + currentBal);
        }

        else
        if(item.equals("Blanket"))
        {
            int currentBal = giftCard - 60;
            System.out.println("Thank you for your purchase!"
                    + "\n your current balance is " + currentBal);
        }

        else
        if(item.equals("Pillow"))
        {
            int currentBal = giftCard - 40;
            System.out.println("Thank you for your purchase!"
                    + "\n your current balance is " + currentBal);
        }

        else

            System.out.println("Invalid item!");
    }

}