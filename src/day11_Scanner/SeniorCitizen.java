package day11_Scanner;

import java.util.*;

public class SeniorCitizen {

        public static void main(String[] args) {

            bienvenue();

            int seniorCitizens,nonSeniorCitizens,age;
            Scanner citizen = new Scanner(System.in);

            System.out.println("Enter current count for seniorCitizens \n and nonSeniorCitizens:");
            seniorCitizens = citizen.nextInt();
            nonSeniorCitizens = citizen.nextInt();

            System.out.println("What is new citizen's age?");
            age = citizen.nextInt();

            if (age >= 65){
                System.out.println("\nSenior Citizen");
                seniorCitizens++;
            }
            else
            {
                System.out.println("Non-Senior Citizen");
                nonSeniorCitizens++;
            }

            System.out.println("New seniorCitizens count " + (seniorCitizens++));
            System.out.println("New nonSeniorCitizens count " + (nonSeniorCitizens++));


        }

    public static void bienvenue() {

        String welcome ="\t\tJean \t\tMichel \t\tChauvet" +
                "\n\t\t   QA Student, Batch 18" +
                " Engineer SDET" +
                "\n\t\t\t\tPhone : (571)-758-9328" +
                "\n\t-------------------------------------------";
        System.out.println(welcome);
        System.out.println();
    }
}

