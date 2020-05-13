package day10_Switch_Scanner;
/*
Create a switch statement testing for A,B,C,D or E.Display a message if any of these are found and then break.Add a default which displays a message saying not found.
 */
public class SwitchStatement1 {
    public static void main(String[] args) {
        char charVariable = 'F';
        switch (charVariable ) {
            case 'A' :
                System.out.println("Char " + charVariable + " found");
                break;
            case 'B' :
                System.out.println("Char " + charVariable + " found");
                break;
            case 'C' :
                System.out.println("Char " + charVariable + " found");
                break;
            case 'D' :
                System.out.println("Char " + charVariable + " found");
                break;
            case 'E' :
                System.out.println("Char " + charVariable + " found");
                break;
            default:
                System.out.println("Char " + charVariable + " not found");
        }
    }
}
