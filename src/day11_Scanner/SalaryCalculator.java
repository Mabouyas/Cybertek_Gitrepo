package day11_Scanner;
/*
2. write a program that can calculate the salary after tax
                needed information:
                                employee' salary
                                state tax
                                federal tax
 */

import javax.swing.*;
import java.text.NumberFormat;
import java.util.*;

public class SalaryCalculator {
    public static void main(String[] args) {

        bienvenue();

        final byte pourcent = 100;
        Scanner employe = new Scanner(System.in);

        System.out.print("Entrez votre salaire, S.V.P. :");
        int salaire = employe.nextInt();

        System.out.print("Entrez votre tax state :");
        float stateTax = employe.nextFloat();
        float stTaxPercent = stateTax / pourcent;

        System.out.print("Soumttez votre tax federal : ");
        float federalTax = employe.nextFloat();
        float fedTaxPercent = federalTax / pourcent;

        float montantStateTax = salaire * stTaxPercent;
        float montantFedTax = salaire * fedTaxPercent;

        float montantTotal = montantStateTax + montantFedTax;

        float salaire_De_Lemploye = salaire - montantTotal;

        String salaireFormate = NumberFormat.getCurrencyInstance().format(salaire_De_Lemploye);
        String montantFormate = NumberFormat.getCurrencyInstance().format(montantTotal);

        System.out.println("Votre salaire apres tax $: " + salaireFormate);
        System.out.println(" Votre tax total paye $:" + montantTotal);


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


