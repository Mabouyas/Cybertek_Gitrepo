package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int age = 85;
        String ageYear ="";
        String eligible ="";

        ageYear = (age <= 3) ? "Baby"
                : (age > 3 && age <= 5) ? "Toddler"
                : (age >= 6 && age <= 9) ? "Kid"
                : (age >= 10 && age <= 12) ? "Pre-Teen"
                : (age >= 13 && age <= 17) ? "Teenager"
                : (age >= 18 && age <= 20) ? "Young Adult"
                : (age >= 21 && age <= 39) ? "Adult"
                : (age >= 40 && age <= 49) ? "Young Middle-Aged Adult"
                : (age >= 50 && age <= 54) ? "Middle-Aged Adult"
                : (age >= 55 && age <= 64) ? "Very Young Senior Citizen"
                : (age >= 65 && age <= 74) ? "Young Senior Citizen"
                : (age >= 75 && age <= 84) ? "Senior Citizen"
                : (age >= 85 && age <= 150) ? "Old Senior Citizen"
                : "Entry Invalid";
        System.out.println(ageYear);
        eligible = (ageYear.equals("Young Adult")
                || ageYear.equals("Adult")
                || ageYear.equals("Young Middle -Aged Adult")
                || ageYear.equals("Middle Ages Adult")
                || ageYear.equals("Very Young Senior Citizen")
                || ageYear.equals("Young Senior Citizen")
                || ageYear.equals("Senior Citizen")
                || ageYear.equals("Old Senior Citizen"))
                ? "You can buy" : "You can't buy";

        System.out.println(eligible);
    }
}
