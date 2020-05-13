package day05_Urany_ShortandOperators;

/*
 2. write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true

* */

public class Divisibility {
    public static void main(String[] args) {
        int number = 65;
        boolean isNumberDivisibleBy2 = number % 2 == 0;
        boolean isNumberDivisibleBy3 = number % 3 == 0;
        boolean isNumberDivisibleBy5 = number % 5 == 0;

        String result1 =(number + " is divisible by 2 " + isNumberDivisibleBy2);
        String result2 =(number + " is divisible by 2 " + isNumberDivisibleBy3);
        String result3 =(number + " is divisible by 2 " + isNumberDivisibleBy5);

        String oneResult = result1 + "\n" + result2 + "\n" + result3;

        System.out.println(oneResult);


    }
}
