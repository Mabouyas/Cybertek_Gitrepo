package day07_IfStatements;
/*
1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triangle is valid or not.
 */
public class ValidTriangle {
    public static void main(String[] args) {
        double angle1 = 40;
        double angle2 = 30;
        double angle3 = 100;
        int sumOfTriangles = (int) (angle1 + angle2 +angle3);

        if (sumOfTriangles == 180) {
            System.out.println("The scale is a valid triangle");
        }
        if (sumOfTriangles != 180) {
            System.out.println("The scale is not a valid triangle");
        }

    }
}
