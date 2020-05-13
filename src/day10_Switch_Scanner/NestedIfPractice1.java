package day10_Switch_Scanner;
/*
write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
 */
public class NestedIfPractice1 {
    public static void main(String[] args) {
        int numbers = 8;
        String number_To_Word = "";

        if(numbers >= 0 && numbers <= 9) {

            if(numbers == 0) number_To_Word = "Zero";
            else if(numbers == 1) number_To_Word = "Un";
            else if(numbers == 2) number_To_Word = "Deux";
            else if(numbers == 3) number_To_Word = "Trois";
            else if(numbers == 4) number_To_Word = "Quatre";
            else if(numbers == 5) number_To_Word = "Cinq";
            else if(numbers == 6) number_To_Word = "Six";
            else if(numbers == 7) number_To_Word = "Sept";
            else if(numbers == 8) number_To_Word = "Huit";
            else number_To_Word = "Neuf";


        }else
            number_To_Word = "Invalid";
        System.out.println(number_To_Word);
    }
}
