package day10_Switch_Scanner;
/*
write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
 */
public class NestedIfPractice2 {
    public static void main(String[] args) {
        int month = -4;
        String dayInMonth = (month == 1) ? "Janvier a 31 jours."
                : (month == 2) ? "Fevrier a 28 jours."
                : (month == 3) ? "Mars a 31 jours."
                : (month == 4) ? "Avril a 30 jours."
                : (month == 5) ? "Mai a 31 jours."
                : (month == 6) ? "Juin a 30 jours."
                : (month == 7) ? "Juillet a 31 jours."
                : (month == 8) ? "Aout a 31 jours."
                : (month == 9) ? "Septembre a 30 jours."
                : (month == 10) ? "Octobre a 31 jours."
                : (month == 11) ? "Novembre a 30 jours."
                : (month == 12) ? "Decembre a 31 jours."
                : ("Invalide.");

        System.out.println(dayInMonth);




    }
}
