package Kapitel2;

import java.util.Scanner;

public class KlasseNavn{

    int a = 6;

    KlasseNavn() {
        System.out.println("Nyt objekt er oprettet");
    }

    int dobbeltOp(int x) {
        return 2*a;
    }

    public static void main(String[] args) {
        // Her starter eksekvering
        KlasseNavn o = new KlasseNavn();
        KlasseNavn p = new KlasseNavn();
        KlasseNavn q= new KlasseNavn();
        Scanner s = new Scanner(System.in);
    }

}
