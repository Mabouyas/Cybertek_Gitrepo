package day10_Switch_Scanner;
/*
 write a program that can display the days based on the numbers 1 ~ 7
 */
public class NestedIfPractice {
    public static void main(String[] args) {
        int day = 7;
        String jourDeLaSemaine = "";

        if(day >= 1 && day <=7) {

            if(day == 1) jourDeLaSemaine = "Lundi";
            else if(day == 2) jourDeLaSemaine = "Mardi";
            else if(day == 3) jourDeLaSemaine = "Mercredi";
            else if(day == 4) jourDeLaSemaine = "Jeudi";
            else if(day == 5) jourDeLaSemaine = "Vendredi";
            else if(day == 6) jourDeLaSemaine = "Samedi";
            else jourDeLaSemaine = "Dimanche";

        }
        else
            jourDeLaSemaine = "Invalid Entry.";
            System.out.println(jourDeLaSemaine);
    }
}
