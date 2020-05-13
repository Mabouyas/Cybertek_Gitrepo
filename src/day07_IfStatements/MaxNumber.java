package day07_IfStatements;
/*
write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */


public class MaxNumber {
    public static void main(String[] args) {
        double a = 80;
        double b = 25.4;
        double c = 30;

        boolean aGreater = a>b && a>c;
        boolean bGreater = b>a && b>c;
        boolean cGreater = c>a && c>b;

        if (aGreater) {
            System.out.println("A is the greater number");
        }
        if (bGreater) {
            System.out.println("B is the greater number");
        }
        if (cGreater) {
            System.out.println("C is the greater number");
        }
        }
    }
