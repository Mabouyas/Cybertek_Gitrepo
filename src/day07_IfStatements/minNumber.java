package day07_IfStatements;

public class minNumber {
    public static void main(String[] args) {
        int num1 = 100,num2 = 20,num3 = 45;
        int temp,result;

        temp = num1 < num2 ? num1 : num2;
        result = num3 < temp ? num3 : temp;


        System.out.println(result);
    }
}
