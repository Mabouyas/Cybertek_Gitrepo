package day09_NestedIf_Ternary;
/*write a program that can define the age groups of a person
        age groups are:
        baby (< 3 year)
        Toddler (3 - 5),
        Kid (6 - 9),
        Pre-Teen (10 - 12),
        Teenager (13 - 17),
        Young Adult (18 - 20),
        Adult (21 - 39),
        Young Middle-Aged Adult (40 - 49),
        Middle-Aged Adult (50 - 54),
        Very Young Senior Citizen (55 - 64),
        Young Senior Citizen (65 - 74),
        Senior Citizen (75 - 84),
        Old Senior Citizen (85+)
        /*
 */
public class ageGroupOfPerson {
    public static void main(String[] args) {
        int age = 152;
        String categoryPerson = "";

        if( age <= 3) categoryPerson = "Baby";
        else if(age > 3 && age <= 5) categoryPerson = "Toddler";
        else if(age > 5 && age <= 9) categoryPerson = "Kid";
        else if(age >= 10 && age <= 12) categoryPerson = "Pre-Teen";
        else if(age >= 13 && age <= 17) categoryPerson = "Teenager";
        else if(age >= 18 && age <= 20) categoryPerson = "Young Adult";
        else if(age >= 21 && age <= 39) categoryPerson = "Adult";
        else if(age >= 40 && age <= 49) categoryPerson = "Young Middle-Aged Adult";
        else if(age >= 50 && age <= 54) categoryPerson = "Middle-Aged Adult";
        else if(age >= 55 && age <= 64) categoryPerson = "Very Young Senior Citizen";
        else if(age >= 65 && age <= 74) categoryPerson = "Young Senior Citizen";
        else if(age >= 75 && age <= 84) categoryPerson = "Senior Citizen";
        else if(age >= 84 && age <= 150) categoryPerson = "Old Senior Citizen";
        else categoryPerson = " Invalid Entry";
        System.out.println(categoryPerson);

    }

}
