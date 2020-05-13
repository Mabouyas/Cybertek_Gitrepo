package day08_IfStatements;

public class equalNumbers {
    /*
    write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are equal ==> n3&n1 are equal
			if all equal ==> all equal
			if none of them are equal ==> none of them are equal
     */
    public static void main(String[] args) {
        double n1 = 100;
        double  n2 = 100;
        double  n3 = 100;

        boolean n1EqualN2 = n1 == n2 && n1 != n3;
        boolean n1EqualN3 = n1 == n3 && n1 != n2;
        boolean n2EqualN3 = n2 == n3 && n2 != n1;
        boolean allEqual = n1 ==n2 && n1 == n3;
        boolean noneAreEqual = n1 != n2 && n1 != n3 && n2 != n3;

        if (n1EqualN2)
            System.out.println(n1 + " and " + n2 + " are equal");

        if (n1EqualN3)
            System.out.println(n1 + " and " + n3 + " are equal");

        if (n2EqualN3)
            System.out.println(n2 + " and " + n3 + " are equal");

        if (allEqual)
            System.out.println("All 3 numbers are equals");

        if (noneAreEqual)
            System.out.println("None of those 3 numbers are equals.");
    }
}
