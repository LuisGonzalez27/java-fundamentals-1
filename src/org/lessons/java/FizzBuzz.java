package org.lessons.java;

import java.util.Scanner;
import java.util.InputMismatchException;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int numeriStampa = 0;

        while (numeriStampa <= 0 || numeriStampa >= 1000) {
            System.out.print("Inserisci quanti numeri vuoi stampare: ");

            try {
                numeriStampa = inputScanner.nextInt();
                if (numeriStampa <= 0 || numeriStampa >= 1000) {
                    System.out.println("Il valore inserito non è valido. Inserisci un numero da 1 a 999.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Il valore inserito non è un numero!");
                inputScanner.next();
            }
        }

        inputScanner.close();

        for (int i = 1; i <= numeriStampa ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}