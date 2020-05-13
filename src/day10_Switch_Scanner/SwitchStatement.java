package day10_Switch_Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
       int dayOfTheWeek = 0;
        switch (dayOfTheWeek) {
            case 1 :
                System.out.println("Monday " +   dayOfTheWeek + "th day of the week");
                break;
            case 2 :
                System.out.println("Tuesday " + dayOfTheWeek + "th day of the week");
                break;
            case 3 :
                System.out.println("Wednesday " + dayOfTheWeek + "th day of the week");
                break;
            case 4 :
                System.out.println("Thursday " + dayOfTheWeek + "th day of the week");
                break;
            case 5 :
                System.out.println("Friday " + dayOfTheWeek + "th day of the week");
                break;
            case 6 :
                System.out.println("Saturday " + dayOfTheWeek + "th day of the week");
                break;
            case 7 :
                System.out.println("Sunday " + dayOfTheWeek + "th day of the week");
                break;

                default:

                    System.out.println( dayOfTheWeek + " Invalid day");
        }


    }
}
