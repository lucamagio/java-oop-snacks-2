package convertitore;

import java.util.Arrays;
import java.util.Scanner;

public class ProgrammaConversione {
    public static void main(String[] args) {
        ConvertitoreValute conversione = new ConvertitoreValute();

        Scanner scan = new Scanner(System.in);

        System.out.println("Benvenuto nella conversione delle valute"); 
        System.out.println("Scegli la conversione desiderata tra quelle disponibili: " 
                            + Arrays.toString(conversione.getValute()));

        System.out.println("Inserisci la valuta iniziale: ");
        String daValuta = scan.next();
        
        System.out.println("Inserisci la valuta finale: ");
        String aValuta = scan.next();

        System.out.println("Inserisci l'importo da convertire: ");
        double importo = scan.nextDouble();

        System.out.println("L'importo convertito è pari a: " 
                            + ConvertitoreValute.converti(daValuta.toUpperCase(), aValuta.toUpperCase(), importo));

    }
}
