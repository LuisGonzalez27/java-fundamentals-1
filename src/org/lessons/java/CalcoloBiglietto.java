package org.lessons.java;

import java.util.Scanner;
import java.text.DecimalFormat;
public class CalcoloBiglietto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci quanti kilometri vuoi percorrere:");
        int kmPercorrere = Integer.parseInt(scan.nextLine());

        System.out.println("Inserisci la tua eta:");
        int etaPasseggero = Integer.parseInt(scan.nextLine());

        double prezzoBiglietto = 0.21 * kmPercorrere;

        if(etaPasseggero < 18 ){
            double minorenne = (prezzoBiglietto * 20) / 100;
            double prezzoFinale = prezzoBiglietto - minorenne;

            //uso DecimalFormat  dato che voglio solo una cifra decimale
            DecimalFormat decimali = new DecimalFormat("#.#");
            System.out.println("Prezzo biglietto con sconto minorenne: " + decimali.format(prezzoFinale) + " EUR");
        }
        else if(etaPasseggero <= 65){
            DecimalFormat decimali = new DecimalFormat("#.#");
            System.out.println("Prezzo biglietto: " + decimali.format(prezzoBiglietto)  + " EUR");
        }
        else {
            double over65 = (prezzoBiglietto * 40) / 100;
            double prezzoFinale = prezzoBiglietto - over65;
            DecimalFormat decimali = new DecimalFormat("#.#");
            System.out.println("Prezzo biglietto con sconto over 65: " + decimali.format(prezzoFinale) + " EUR");
        }
    }
}
